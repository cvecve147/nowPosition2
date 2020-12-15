import 'dart:math';
import 'dart:convert';

import 'package:dio/dio.dart';
import 'package:flutter/material.dart';
import 'package:flutter_image/network.dart';
import 'package:flutter_blue/flutter_blue.dart';
import 'package:nowPosition/class/AcceptRssi.dart';
import 'package:nowPosition/class/WalkSpace.dart';
import 'package:flutter_compass/flutter_compass.dart';

import '../searchTag.dart';
import '../class/Device.dart';
import '../class/Target.dart';
import '../components/canvas.dart';
import '../class/PhotoLocation.dart';

List<Device> device = new List<Device>();
List<Device> nowPosition = new List<Device>();
List<Device> nowPositionMin = new List<Device>();
double xCoefficient = 8.46;
double yCoefficient = 7.7;
// 初始化所有Tag 值
// 取消多輸入的情形
// 若取修多輸入 需修改定位過濾功能
int needRssiCount = 10;

class Position extends StatefulWidget {
  String title = "", position = "", image = "";
  double rotate = 0;
  int sin;
  int startPhotoNum;
  Position(
      {Key key,
      this.title,
      this.position,
      this.image,
      this.rotate,
      this.sin,
      this.startPhotoNum})
      : super(key: key);
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

  List<Device> calculationDist(bool ismin) {
    int count = 0;
    List<Device> point = new List<Device>();
    for (var item in device) {
      if (item.rssi.length >= needRssiCount && item.notGetRssi == 0) {
        count += 1;
      }
    }
    point.clear();
    for (var item in device) {
      if (count >= 3 &&
          item.rssi.length >= needRssiCount &&
          item.notGetRssi == 0) {
        List<int> tmp = item.rssi.toList();
        tmp = tmp.sublist(0, needRssiCount); //不過濾最後一個
        int maxrssi = tmp.reduce(max); //負數最大
        int minrssi = tmp.reduce(min); //負數最小

        int sum = item.rssi.reduce((a, b) => a + b);
        sum = sum.abs();
        double rssi = (sum + maxrssi + minrssi) / (item.rssi.length - 2);
        double power;
        if (ismin) {
          power = (maxrssi.abs() - item.rssiDef) / (10.0 * 3.3);
        } else {
          power = (rssi.abs() - item.rssiDef) / (10.0 * 3.3);
        }
        item.distance = pow(10, power);
        print("dist:" + item.distance.toString());
        point.add(Device(
            mac: item.mac,
            x: item.x,
            y: item.y,
            rssiDef: item.rssiDef,
            distance: item.distance));
      }
    }
    return point;
  }

  calculationPosition(point, arr) {
    point.sort((a, b) {
      return a.distance > b.distance ? 1 : -1;
    });

    print("point:" + point[0].rssi.toString());
    print("point:" + point[0].mac + " dis:" + point[0].distance.toString());
    print("point:" + point[1].rssi.toString());
    print("point:" + point[1].mac + " dis:" + point[1].distance.toString());
    print("point:" + point[2].rssi.toString());
    print("point:" + point[2].mac + " dis:" + point[2].distance.toString());
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
    print("x: " + X.toString() + " y: " + Y.toString());
    if (walkspace(X, Y)) {
      distPhoto(X, Y);
      arr.add(Device(mac: "", x: X, y: Y));
      return "${X.toStringAsFixed(2)} , ${Y.toStringAsFixed(2)} 與上點距離為${dist.toStringAsFixed(2)}";
    }

    return "${X.toStringAsFixed(2)} , ${Y.toStringAsFixed(2)} 超出範圍";
  }

  distPhoto(X, Y) {
    double distMin = 9999;
    for (var item in this.photoLocation) {
      double dist = sqrt(pow(item.x - X, 2) + pow(item.y - Y, 2));
      if (distMin > dist) {
        distMin = dist;
        this.nearNum = item.number;
      }
    }
  }

  bool walkspace(double X, double Y) {
    int startX = (X * xCoefficient).toInt();
    int startY = (400 - Y * yCoefficient).toInt();
    if (startX < 0 ||
        startX >= 400 ||
        startY < 0 ||
        startY >= 400 ||
        g[startX][startY] == 1) {
      return false;
    }
    return true;
  }

  putRssi(List<AcceptRssi> snapshot) async {
    if (snapshot.length == 0) return;
    for (var item in device) {
      //如果超過10次沒收到 清空
      item.notGetRssi += 1;
      if (item.notGetRssi > needRssiCount + 2) {
        item.DeviceClearRssi();
      }
    }
    for (var getrssi in snapshot) {
      // print("${getrssi.mac}:${getrssi.rssi}");
      for (var item in device) {
        if (item.mac == getrssi.mac.toString()) {
          item.notGetRssi = 0;
          if (item.rssi.isEmpty == false && item.rssi.last == getrssi.rssi) {
            continue;
          }
          if (item.rssi.length < needRssiCount) {
            item.rssi.add(getrssi.rssi);
          } else {
            item.rssi.removeFirst();
            item.rssi.add(getrssi.rssi);
          }
          break;
        }
      }
    }
    // setState(() {});
  }

  double _direction;
  List<List<int>> g;
  String position = "";
  List<ScanResult> topThreeDate = List();
  List<Target> targetList = List<Target>();
  List<WalkSpace> walkSpaceList = List<WalkSpace>();
  List<PhotoLocation> photoLocation = List<PhotoLocation>();
  @override
  void initState() {
    super.initState();
    WidgetsBinding.instance.addPostFrameCallback((_) async {
      await _getData();
    });
    FlutterCompass.events.listen((double direction) {
      setState(() {
        _direction = direction;
      });
    });
  }

  Target _selectTarget;
  int thread = -1;
  bool goMap = false;
  bool isloading = true;
  double caculationAngle;
  int photoNumber;
  String nearNum = "0";
  _getData() async {
    isloading = true;

    this.position = "loading";
    var dio = Dio();
    device.clear();
    nowPosition.clear();
    targetList.clear();
    walkSpaceList.clear();
    device.clear();
    String tmp = widget.position;
    List<String> getDataList = [
      "position-tags",
      "target-point",
      "walk",
      "photo-location"
    ];
    for (var path in getDataList) {
      Response response = await dio.get(
          'http://120.105.161.209:3000/${path}?query={"where":{"position":"${tmp}"},"limit":100,"page":1}');
      for (var item in response.data["data"]) {
        if (path == "target-point") {
          targetList.add(Target(
              position: item["position"],
              x: double.parse(item["x"]),
              y: double.parse(item["y"]),
              targetName: item["targetName"]));
        } else if (path == "walk") {
          walkSpaceList.add(WalkSpace(
            position: item["position"],
            x: double.parse(item["x"]),
            y: double.parse(item["y"]),
            x1: double.parse(item["x1"]),
            y1: double.parse(item["y1"]),
          ));
        } else if (path == "position-tags") {
          device.add(Device(
              mac: item["mac"],
              x: double.parse(item["x"]),
              y: double.parse(item["y"]),
              rssiDef: int.parse(item["rssi"])));
        } else if (path == "photo-location") {
          double x;
          double y;
          if (item["x"] is String) {
            x = double.parse(item["x"]);
          } else {
            x = item["x"];
          }
          if (item["y"] is String) {
            y = double.parse(item["y"]);
          } else {
            y = item["y"];
          }
          photoLocation.add(PhotoLocation(number: item["num"], x: x, y: y));
        }
      }
    }
    if (targetList.length > 1) {
      _selectTarget = targetList[0];
    }
    this.g = List.generate(400, (i) => List.generate(400, (i) => 1));
    for (var item in walkSpaceList) {
      for (int i = (item.x * xCoefficient).toInt();
          i < (item.x1 * xCoefficient).toInt();
          i++) {
        for (int j = (400 - item.y * yCoefficient).toInt();
            j < (400 - item.y1 * yCoefficient).toInt();
            j++) {
          g[i][j] = 0;
        }
      }
    }
    distPhoto(12.0, 13.0);
    this.position = "ok";
    setState(() {
      isloading = false;
    });
  }

  final TextEditingController _controller = new TextEditingController();
  int tmpCountRssi = 0;
  @override
  Widget build(BuildContext context) {
    bool condition = true;
    photoNumber = this.widget.startPhotoNum;
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
            children: [
              StreamBuilder<List<ScanResult>>(
                  stream: FlutterBlue.instance.scanResults,
                  initialData: [],
                  builder: (c, snapshot) {
                    List<AcceptRssi> ac = List<AcceptRssi>();

                    for (var item in snapshot.data.toSet()) {
                      ac.add(AcceptRssi(item.device.id.toString(), item.rssi));
                    }
                    // print(ac.toList());
                    if (ac != null) {
                      putRssi(ac);
                    }
                    List<Device> point1 = calculationDist(false);
                    print("min");
                    List<Device> point2 = calculationDist(true);
                    if (point1.length >= 3) {
                      position = calculationPosition(point1, nowPosition);
                      calculationPosition(point2, nowPositionMin);
                      for (var item in device) {
                        item.DeviceClearRssi();
                      }
                    } else {
                      position = "此次收集數量不足";
                    }
                    position += "\n";
                    return SingleChildScrollView(
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
                                items: targetList.map<DropdownMenuItem<Target>>(
                                    (Target value) {
                                  return DropdownMenuItem<Target>(
                                    value: value,
                                    child: Text(value.targetName),
                                  );
                                }).toList(),
                              ),
                              Container(
                                margin: const EdgeInsets.only(
                                    left: 10.0, right: 10.0),
                              ),
                              RaisedButton(
                                  onPressed: () {
                                    this.setState(() {
                                      goMap = !goMap;
                                    });
                                  },
                                  textColor: Colors.white,
                                  color: Colors.blue,
                                  child: const Text('導航',
                                      style: TextStyle(fontSize: 16))),
                              Container(
                                margin: const EdgeInsets.only(
                                    left: 10.0, right: 10.0),
                              ),
                            ],
                          ),
                          Container(
                            alignment: Alignment.center,
                            child: Text("Rotate:" + caculationAngle.toString()),
                          ),
                          Container(
                            child: Column(
                              mainAxisAlignment: MainAxisAlignment.start,
                              children: <Widget>[
                                if (!condition) Text("開始掃描"),
                                Text("Thread:" + thread.toString()),
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
                                for (var item in topThreeDate)
                                  Text(item.rssi.toString()),
                                if (!goMap)
                                  canvasRoute(widget.image, caculationAngle),
                                if (goMap)
                                  canvasRoute(widget.image, caculationAngle,
                                      targetPoint: this._selectTarget,
                                      space: this.walkSpaceList,
                                      g: this.g),
                              ],
                            ),
                          )
                        ],
                      ),
                    );
                  }),
              StreamBuilder<double>(
                  stream: FlutterCompass.events,
                  builder: (context, snapshot2) {
                    if (snapshot2.hasError || targetList == null) {
                      return Text('Error reading heading: ${snapshot2.error}');
                    }

                    if (snapshot2.connectionState == ConnectionState.waiting) {
                      return Center(
                        child: CircularProgressIndicator(),
                      );
                    }
                    if (isloading) {
                      return Text("loading Data");
                    }
                    double direction = snapshot2.data;

                    if (direction == null)
                      return Center(
                        child: Text("Device does not have sensors !"),
                      );
                    photoNumber += (direction / 90.0).round();
                    photoNumber %= 4;

                    caculationAngle =
                        (((direction ?? 0) * (pi / 180) * this.widget.sin) +
                            this.widget.rotate * pi);
                    return Image(
                      image: new NetworkImageWithRetry(
                          'http://120.105.161.209/Nursemaid/image/Walk/${nearNum}_${photoNumber.toString()}.jpg'),
                    );
                  }),
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
                });
              },
              backgroundColor: Colors.red,
            );
          } else {
            return FloatingActionButton(
                child: Icon(Icons.search),
                onPressed: () async {
                  await FlutterBlue.instance.startScan(
                      allowDuplicates: true, timeout: Duration(seconds: 999));
                  await FlutterBlue.instance.stopScan();
                });
          }
        },
      ),
    );
  }
}

/*
allowDuplicates:false;
收超久  且不會有Rssi的改變

allowDuplicates:true;
一直收  只要有一個Rssi變化  上一個就會改變

*/
