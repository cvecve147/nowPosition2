class PhotoLocation {
  double x;
  double y;
  String number;
  PhotoLocation({this.x, this.y, this.number});

  @override
  String toString() {
    return 'Device{number: $number, x: $x, y: $y}';
  }
}
