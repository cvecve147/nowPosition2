import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:flutter_blue/flutter_blue.dart';
import 'package:nowPosition/class/AcceptRssi.dart';
import 'package:nowPosition/class/WalkSpace.dart';
import '../components/canvas.dart';
import 'dart:math';
import '../class/Device.dart';
import '../searchTag.dart';
import 'package:dio/dio.dart';
import '../class/DataStorage.dart';
import '../class/Target.dart';

List<Device> device = new List<Device>();
List<Device> nowPosition = new List<Device>();

// 初始化所有Tag 值
// 取消多輸入的情形
// 若取修多輸入 需修改定位過濾功能
int needRssiCount = 5;

class Position extends StatefulWidget {
  String title = "", position = "", image = "";
  Position({Key key, this.title, this.position, this.image}) : super(key: key);

  @override
  _PositionState createState() => _PositionState();
}

class _PositionState extends State<Position> {
  calculationPreDist(double x, double y) {
    if (nowPosition.length == 0) return 0.0;
    double prePointX = nowPosition[nowPosition.length - 1].x;
    double prePointY = nowPosition[nowPosition.length - 1].y;
    double dist = sqrt(pow(prePointX - x, 2) + pow(prePointY - y, 2));
    return dist;
  }

  calculationDist() {
    int count = 0;
    List<Device> point = List<Device>();
    for (var item in device) {
      if (item.rssi.length >= needRssiCount && item.notGetRssi == 0) {
        count += 1;
      }
    }
    for (var item in device) {
      if (count >= 3 &&
          item.rssi.length >= needRssiCount &&
          item.notGetRssi == 0) {
        List<int> tmp = item.rssi.toList();
        tmp = tmp.sublist(0, 5); //不過濾最後一個
        int maxrssi = tmp.reduce(max); //負數最大
        int minrssi = tmp.reduce(min); //負數最小

        int sum = item.rssi.reduce((a, b) => a + b);
        sum = sum.abs();
        double rssi = (sum + maxrssi + minrssi) / (item.rssi.length - 2);
        double power = (rssi - item.rssiDef) / (10.0 * 3.3);
        item.distance = pow(10, power);
        point.add(item);
      }
    }
    if (point.length > 0) {
      point.sort((a, b) {
        return a.distance > b.distance ? -1 : 1;
      });
    }
    return point;
  }

  calculationPosition(point) {
    double X, Y;
    X = Y = 0;
    for (int i = 0; i < 2; i++) {
      for (int j = i + 1; j < 3; j++) {
        if (point[i].distance < 0) {
          return Container(child: Text("系統錯誤"));
        }
        double p2p = sqrt(pow(point[i].x - point[j].x, 2) +
            pow(point[i].y - point[j].y, 2)); //圓心公式
        //判斷两圆是否相交
        if (point[i].distance + point[j].distance <= p2p) {
          // var overDisance = point[i].distance + point[j].distance;
          //不相交，按比例求
          X += point[i].x +
              (point[j].x - point[i].x) *
                  point[i].distance /
                  (point[i].distance + point[j].distance);
          //x = x0 + (x1 - x0) * r0 / (r0 + r1);
          Y += point[i].y +
              (point[j].y - point[i].y) *
                  point[i].distance /
                  (point[i].distance + point[j].distance);
          //y = y0 + (y1 - y0) * r0 / (r0 + r1);
        } else {
          //相交则套用公式（上面推导出的）
          //(BE) =(AB) /2+((BQ) ^2-(AQ) ^2)/(2(AB)  )
          double dr = p2p / 2 +
              (pow(point[i].distance, 2) - pow(point[j].distance, 2)) /
                  (2 * p2p);
          X += point[i].x + (point[j].x - point[i].x) * dr / p2p;
          Y += point[i].y + (point[j].y - point[i].y) * dr / p2p;
        }
      }
    }
    X /= 3;
    Y /= 3;
    double dist = calculationPreDist(X, Y);
    nowPosition.add(Device(mac: "", x: X, y: Y));
    return "${X.toStringAsFixed(2)} , ${Y.toStringAsFixed(2)} 與上點距離為${dist.toStringAsFixed(2)}";
  }

  putRssi(List<AcceptRssi> snapshot) {
    if (snapshot.length == 0) return;
    for (var item in device) {
      //如果超過10次沒收到 清空
      item.notGetRssi += 1;
      if (item.notGetRssi > 7) {
        item.DeviceClearRssi();
      }
    }
    for (var getrssi in snapshot) {
      print("${getrssi.mac}:${getrssi.rssi}");
      for (var item in device) {
        if (item.mac == getrssi.mac.toString()) {
          item.notGetRssi = 0;
          if (item.rssi.length < 5) {
            item.rssi.add(getrssi.rssi);
          } else {
            item.rssi.removeFirst();
            item.rssi.add(getrssi.rssi);
          }
          break;
        }
      }
    }
    setState(() {});
  }

  List<ScanResult> topThreeDate = new List();
  String position = "";
  List<Target> targetList = List<Target>();
  List<WalkSpace> walkSpaceList = List<WalkSpace>();
  DataStorage storage;
  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addPostFrameCallback((_) {
      _getData();
    });
  }

  Target _selectTarget;
  int thead = 0;
  bool goMap = false;
  _getData() async {
    storage = DataStorage();
    await storage.writeNext(-1, widget.position);
    thead = -1;
    this.position = "loading";
    var dio = Dio();
    device.clear();
    nowPosition.clear();
    Response response = await dio.get(
        'http://120.105.161.209:3000/position-tags?query=%7B%22where%22%3A%7B%22position%22%3A%22${widget.position}%22%7D%7D');

    for (var item in response.data["data"]) {
      device.add(Device(
          mac: item["mac"],
          x: double.parse(item["x"]),
          y: double.parse(item["y"]),
          rssiDef: int.parse(item["rssi"])));
    }
    String positionName = "";
    if (widget.position == "Walk") {
      positionName = "7F";
    } else {
      positionName = widget.position;
    }

    response = await dio.get(
        'http://120.105.161.209:3000/target-point?query=%7B%22where%22%3A%7B%22position%22%3A%22${positionName}%22%7D%7D');
    for (var item in response.data["data"]) {
      targetList.add(Target(
          position: item["position"],
          x: double.parse(item["x"]),
          y: double.parse(item["y"]),
          targetName: item["targetName"]));
    }
    response = await dio.get(
        'http://120.105.161.209:3000/walk?query=%7B%22where%22%3A%7B%22position%22%3A%22${positionName}%22%7D%7D');
    for (var item in response.data["data"]) {
      walkSpaceList.add(WalkSpace(
          position: item["position"],
          x: double.parse(item["x"]),
          y: double.parse(item["y"]),
          x1: double.parse(item["x1"]),
          y1: double.parse(item["y1"]),
          x2: double.parse(item["x2"]),
          y2: double.parse(item["y2"]),
          x3: double.parse(item["x3"]),
          y3: double.parse(item["y3"])));
    }
    setState(() {});
    this.position = "ok";
    if (targetList.length > 0) {
      _selectTarget = targetList[0];
    } else {
      _selectTarget = Target();
    }
  }

  @override
  Widget build(BuildContext context) {
    bool condition = true;
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title + widget.position),
        actions: <Widget>[
          RaisedButton(
            color: Colors.blue,
            child: Icon(
              Icons.search,
              color: Colors.white,
            ),
            onPressed: () {
              Navigator.push(
                context,
                MaterialPageRoute(builder: (context) => SecondRoute()),
              );
            },
          )
        ],
      ),
      body: RefreshIndicator(
        onRefresh: () =>
            FlutterBlue.instance.startScan(timeout: Duration(seconds: 4)),
        child: SingleChildScrollView(
          child: Column(
            children: <Widget>[
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  DropdownButton<Target>(
                    value: this._selectTarget,
                    iconSize: 24,
                    elevation: 16,
                    style: TextStyle(color: Colors.deepPurple),
                    underline: Container(
                      height: 2,
                      color: Colors.deepPurpleAccent,
                    ),
                    onChanged: (Target newValue) {
                      setState(() {
                        _selectTarget = newValue;
                      });
                    },
                    items: targetList
                        .map<DropdownMenuItem<Target>>((Target value) {
                      return DropdownMenuItem<Target>(
                        value: value,
                        child: Text(value.targetName),
                      );
                    }).toList(),
                  ),
                  Container(
                    margin: const EdgeInsets.only(left: 10.0, right: 10.0),
                  ),
                  RaisedButton(
                      onPressed: () {
                        this.setState(() {
                          goMap = !goMap;
                          print(goMap);
                        });
                      },
                      textColor: Colors.white,
                      color: Colors.blue,
                      child: const Text('導航', style: TextStyle(fontSize: 16))),
                ],
              ),
              Container(
                child: Column(
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: <Widget>[
                    if (!condition) Text("開始掃描"),
                    Text("Thead:" + thead.toString()),
                    Text(
                      position,
                      style: TextStyle(fontSize: 18),
                    ),
                    for (var item in device)
                      if (item.rssi.length > 0)
                        Column(
                          children: <Widget>[
                            Text(item.mac),
                            Text(item.rssi.join("、"))
                          ],
                        ),
                    for (var item in topThreeDate) Text(item.rssi.toString()),
                    if (!goMap)
                      canvasRoute(
                        widget.image,
                        nowState: "0",
                      ),
                    if (goMap)
                      canvasRoute(
                        widget.image,
                        targetPoint: this._selectTarget,
                        space: this.walkSpaceList,
                        nowState: "1",
                      )
                  ],
                ),
              )
            ],
          ),
        ),
      ),
      floatingActionButton: StreamBuilder<bool>(
        stream: FlutterBlue.instance.isScanning,
        initialData: false,
        builder: (c, snapshot) {
          if (snapshot.data) {
            return FloatingActionButton(
              child: Icon(Icons.stop),
              onPressed: () async {
                setState(() async {
                  condition = true;
                  await FlutterBlue.instance.stopScan();
                  await storage.writeNext(-3, widget.position);
                });
              },
              backgroundColor: Colors.red,
            );
          } else {
            return FloatingActionButton(
                child: Icon(Icons.search),
                onPressed: () async {
                  FlutterBlue.instance
                      .startScan(timeout: Duration(seconds: 999));
                  await storage.writeNext(0, widget.position);
                  String laTime = "";
                  setState(() {
                    condition = false;
                  });
                  while (true) {
                    if (condition) {
                      break;
                    }
                    List<String> data = await storage.readData();
                    if (data.length <= 1 || data[0] == "") continue;
                    setState(() {
                      thead = int.parse(data[0]);
                    });
                    if (data.length >= 3) {
                      if (laTime != data[2]) {
                        List<dynamic> decode = jsonDecode(data[3]);
                        laTime = data[2];
                        List<AcceptRssi> de = List<AcceptRssi>();
                        for (var item in decode) {
                          de.add(AcceptRssi.fromJson(item));
                        }
                        if (de.length > 0) {
                          putRssi(de);
                        }
                        List point = calculationDist();
                        if (point.length >= 3) {
                          position = calculationPosition(point);
                        } else {
                          position = "此次收集數量不足";
                        }
                        position += "\n";
                      }
                    }
                  }
                });
          }
        },
      ),
    );
  }
}
