class Target {
  final String position;
  final double x;
  final double y;
  final String targetName;
  Target({this.position, this.x, this.y, this.targetName});

  @override
  String toString() {
    // TODO: implement toString
    return 'Target{position: $position, x: $x, y: $y,targetName: $targetName}';
  }
}
