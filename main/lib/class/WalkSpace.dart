class WalkSpace {
  final double x;
  final double y;
  final double x1;
  final double y1;
  final String position;
  WalkSpace({
    this.position,
    this.x,
    this.y,
    this.x1,
    this.y1,
  });

  @override
  String toString() {
    return 'Target{position: $position, x: $x, y: $y,x1: $x1,y1: $y1}';
  }
}
