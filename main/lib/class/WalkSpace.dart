class WalkSpace {
  final String position;
  final double x;
  final double y;
  final double x1;
  final double y1;
  final double x2;
  final double y2;
  final double x3;
  final double y3;
  WalkSpace(
      {this.position,
      this.x,
      this.y,
      this.x1,
      this.y1,
      this.x2,
      this.y2,
      this.x3,
      this.y3});

  @override
  String toString() {
    // TODO: implement toString
    return 'Target{position: $position, x: $x, y: $y,x1: $x1,y1: $y1,x2: $x2,y2: $y2,x3: $x3,y3: $y3}';
  }
}
