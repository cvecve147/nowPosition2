import 'dart:async';
import 'dart:convert';
import 'package:dio/dio.dart';
import 'package:flutter/material.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue/flutter_blue.dart';

import './class/DataStorage.dart';
import './class/AcceptRssi.dart';
import './class/Device.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'nowPosition',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MyHomePage(title: 'nowPosition'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  DataStorage storage;
  List<String> data, macList;
  String floor = "";
  Set<ScanResult> collectScanResult;
  List<Device> device = List<Device>();
  String scanRes = "", fetchFloor = "";
  int nowScanTimes = 0;
  int thread = 0;
  @override
  void initState() {
    super.initState();
    collectScanResult = Set<ScanResult>();
    storage = DataStorage();
    macList = List<String>();
    startSearch();
  }

  pushMacList() {
    macList.clear();
    for (var item in device) {
      macList.add(item.mac);
    }
  }

  containsMac(List<ScanResult> snapshot, List macList) {
    List<ScanResult> temp = List<ScanResult>();
    for (var item in snapshot) {
      if (macList.contains(item.device.id.toString())) {
        temp.add(item);
      }
    }
    return temp;
  }

  topThree(List<ScanResult> snapshot) {
    snapshot = containsMac(snapshot, macList);

    snapshot.sort((a, b) {
      return a.rssi > b.rssi ? -1 : 1;
    });
    for (var item in snapshot) {
      print("${item.device.id} ${item.rssi}");
    }
    if (snapshot.length >= 3) {
      return snapshot.sublist(0, 3).toSet();
    }
    return snapshot.toSet();
  }

  _getData() async {
    storage = DataStorage();
    var dio = Dio();
    device.clear();
    Response response = await dio.get(
        'http://120.105.161.209:3000/position-tags?query=%7B%22where%22%3A%7B%22position%22%3A%22${floor}%22%7D%7D');
    for (var item in response.data["data"]) {
      device.add(Device(
          mac: item["mac"],
          x: double.parse(item["x"]),
          y: double.parse(item["y"]),
          rssiDef: int.parse(item["rssi"])));
    }
    print(device.toString());
    setState(() {});
    await pushMacList();
  }

  int id = 1;
  void startSearch() async {
    while (true) {
      data = await storage.readData();
      if (data.length <= 1 || data[0] == "") continue;
      setState(() {
        thread = int.parse(data[0]);
        floor = data[1];
      });
      nowScanTimes = 0;
      if (device.length == 0 || fetchFloor != floor) {
        fetchFloor = floor;
        await _getData();
      }
      while (data[0] == "1") {
        data = await storage.readData();
        collectScanResult.clear();
        await FlutterBlue.instance.startScan(
            timeout: Duration(seconds: 2),
            allowDuplicates: false,
            scanMode: ScanMode.lowLatency);
        FlutterBlue.instance.scanResults.listen((results) {
          for (var item in results) {
            collectScanResult.add(item);
          }
        });
        await FlutterBlue.instance.stopScan();
        data = await storage.readData();
        if (data[0] != id.toString()) {
          break;
        }
        if (collectScanResult.length > 0) {
          collectScanResult = topThree(collectScanResult.toList());

          List<AcceptRssi> res = List<AcceptRssi>();
          for (var item in collectScanResult) {
            res.add(AcceptRssi(item.device.id.toString(), item.rssi));
          }
          String encode = jsonEncode(res);
          setState(() {
            scanRes = encode;
            nowScanTimes++;
          });
          await storage.writeData(int.parse(data[0]), data[1], encode);
        } else {
          await storage.writeNext((int.parse(data[0]) + 1) % 3, data[1]);
          break;
        }
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title + "-" + 2.toString() + "_" + floor),
        ),
        body: Center(
          child: ListView(children: [
            Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Text(
                  "Thread" +
                      thread.toString() +
                      "\nFloor:" +
                      floor +
                      "\nScan:" +
                      scanRes +
                      "\nScanTimes" +
                      nowScanTimes.toString(),
                ),
              ],
            ),
          ]),
        ));
  }
}
