import 'package:flutter/material.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter_blue/flutter_blue.dart';
import 'package:permission_handler/permission_handler.dart';

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
  List<String> data, macList;
  Set<ScanResult> collectScanResult;
  String scanRes = "", fetchFloor = "";
  int nowScanTimes = 0;

  void _requestPerms() async {
    Map<Permission, PermissionStatus> statuses = await [
      Permission.locationWhenInUse,
      Permission.locationAlways,
      Permission.location,
      Permission.accessMediaLocation
    ].request();
    print("statuses:" + statuses.toString());
  }

  @override
  void initState() {
    super.initState();
    collectScanResult = Set<ScanResult>();
    macList = List<String>();
    startSearch();
    _requestPerms();
  }

  void startSearch() async {
    while (true) {
      collectScanResult.clear();
      await FlutterBlue.instance.startScan(
          timeout: Duration(seconds: 6),
          allowDuplicates: false,
          scanMode: ScanMode.lowPower);
      await FlutterBlue.instance.scanResults.listen((results) async {
        for (var item in results) {
          await collectScanResult.add(item);
        }
      });
      await FlutterBlue.instance.stopScan();
      print("Scan:" + collectScanResult.toString());
      print("nowScanTimes:" + nowScanTimes.toString());
      setState(() {
        scanRes = collectScanResult.toString();
        nowScanTimes++;
      });
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(widget.title),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Text(
                "Scan:" + scanRes + "\nScanTimes" + nowScanTimes.toString(),
              ),
            ],
          ),
        ));
  }
}
