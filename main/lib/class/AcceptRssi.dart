class AcceptRssi {
  int rssi;
  String mac;
  AcceptRssi(this.mac, this.rssi);
  AcceptRssi.fromJson(Map<String, dynamic> json)
      : mac = json['mac'],
        rssi = json['rssi'];

  Map<String, dynamic> toJson() => {
        'mac': mac,
        'rssi': rssi,
      };
  @override
  String toString() {
    // TODO: implement toString
    return "mac:${mac}, rssi:${rssi}";
  }
}
