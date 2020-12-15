import 'dart:collection';

class Device {
  double x;
  double y;
  String mac;
  int rssiDef; //Tag 誤差
  int notGetRssi; //抓不到超過5次以上 清空
  Queue<int> rssi; //抓取五個
  double distance;
  Device({this.mac, this.x, this.y, this.rssiDef, this.distance = 0}) {
    this.notGetRssi = 0;
    this.rssi = Queue<int>();
  }

  @override
  String toString() {
    return 'Device{mac: $mac, x: $x, y: $y,Def: $rssiDef}';
  }

  // ignore: non_constant_identifier_names
  DeviceClearRssi() async {
    this.distance = 0;
    this.notGetRssi = 0;
    if (this.rssi.length > 0) {
      this.rssi.clear();
    }
  }
}
