import 'dart:async';
import 'dart:collection';

import 'package:flutter/material.dart';
import 'package:image/image.dart' as image;
import 'package:flutter/cupertino.dart';
import 'package:flutter/services.dart' show rootBundle;
import 'package:nowPosition/class/PointToInt.dart';
import 'package:nowPosition/class/Target.dart';
import 'package:tuple/tuple.dart';
import '../pages/position.dart';
import '../class/WalkSpace.dart';
import '../class/Point.dart';
import 'dart:ui' as ui;

double xCoefficient = 8.46;
double yCoefficient = 7.7;

class canvasRoute extends StatefulWidget {
  String imageUrl = "";
  Target targetPoint = Target();
  List<WalkSpace> space = List<WalkSpace>();
  String nowState = "";
  canvasRoute(this.imageUrl, {this.targetPoint, this.space, this.nowState});

  @override
  _canvasRouteState createState() => _canvasRouteState();
}

class _canvasRouteState extends State<canvasRoute> {
  ui.Image images;
  static Future<ui.Image> loadImageByProvider(ImageProvider provider) async {
    ImageConfiguration config = ImageConfiguration(size: Size(400, 400));

    Completer<ui.Image> completer = Completer<ui.Image>(); //完成的回调
    ImageStreamListener listener;
    ImageStream stream = provider.resolve(config); //获取图片流
    listener = ImageStreamListener((ImageInfo frame, bool sync) {
//监听

      ui.Image image = frame.image;
      completer.complete(image); //完成
      stream.removeListener(listener); //移除监听
    });
    stream.addListener(listener); //添加监听
    return completer.future; //返回
  }

  Completer<ImageInfo> completer = Completer();
  Future<ui.Image> getImage(String path) async {
    var img = new NetworkImage(path);

    img
        .resolve(ImageConfiguration(size: Size(400, 400)))
        .addListener(ImageStreamListener((ImageInfo info, bool _) {
      completer.complete(info);
    }));
    ImageInfo imageInfo = await completer.future;

    return imageInfo.image;
  }

  @override
  void initState() {
    super.initState();
    print(widget.imageUrl);
    (() async {
      if (this.images == null) {
        images = await getImage(widget.imageUrl);

        setState(() {});
      }
    })();
  }

  Future<ui.Image> loadUiImage(String assetPath, height, width) async {
    final data = await rootBundle.load(assetPath);
    image.Image baseSizeImage = image.decodeImage(data.buffer.asUint8List());
    image.Image resizeImage =
        image.copyResize(baseSizeImage, height: height, width: width);
    ui.Codec codec =
        await ui.instantiateImageCodec(image.encodePng(resizeImage));
    ui.FrameInfo frameInfo = await codec.getNextFrame();
    return frameInfo.image;
  }

  @override
  Widget build(BuildContext context) {
    print("now:" + widget.nowState);
    if (this.images == null) return Center(child: Text("loading Image"));
    return Container(
      child: CustomPaint(
        size: Size(400, 400),
        painter: MyPainter(
            image: this.images,
            targetPoint: this.widget.targetPoint,
            space: this.widget.space),
      ),
    );
  }
}

class MyPainter extends CustomPainter {
  ui.Image image;
  Paint painter;
  Target targetPoint = Target();
  List<WalkSpace> space = List<WalkSpace>();
  List<List<Tuple3<int, int, String>>> path;
  MyPainter({this.image, this.targetPoint, this.space});
  @override
  void paint(Canvas canvas, Size size) {
    painter = Paint();
    canvas.drawImageRect(
        image,
        Offset(0.0, 0.0) &
            Size(image.width.toDouble(), image.height.toDouble()),
        Offset(0.0, 0.0) & Size(400, 400),
        painter);

    int n = nowPosition.length;
    Point start;
    if (n > 0) {
      drawPoint(canvas, size, nowPosition[n - 1].x, nowPosition[n - 1].y, "",
          Colors.transparent, Colors.blue[300], 4);
      start = Point(x: nowPosition[n - 1].x, y: nowPosition[n - 1].y);
    } else {
      start = Point(x: 12.0, y: 13);
      drawPoint(
          canvas, size, 12, 13, "", Colors.transparent, Colors.blue[300], 4);
    }
    if (targetPoint != null && space != null) {
      Point end = Point(x: targetPoint.x, y: targetPoint.y);
      bfs(start, end, canvas);
    }

    for (var item in device) {
      drawPoint(canvas, size, item.x, item.y,
          item.mac.substring(15, item.mac.length), Colors.black, Colors.red, 3);
    }
    if (targetPoint != null) {
      drawPoint(canvas, size, targetPoint.x, targetPoint.y,
          targetPoint.targetName, Colors.black, Colors.yellow[700], 4);
    }
  }

  bfs(Point start, Point end, Canvas canvas) {
    //邊界判斷 如果起點> 終點 需 交換計算路徑
    // if (start.x > end.x) {
    //   Point tmp = start;
    //   start = end;
    //   end = tmp;
    // }
    int startX = (start.x * xCoefficient).toInt();
    int startY = (400 - start.y * yCoefficient).toInt();
    int endX = (end.x * xCoefficient).toInt();
    int endY = (400 - end.y * yCoefficient).toInt();

    path = List.generate(
        400, (i) => List.generate(400, (i) => Tuple3(-1, -1, "")));
    List<List<int>> g = List.generate(400, (i) => List.generate(400, (i) => 1));
    for (var item in space) {
      for (int i = (item.x * xCoefficient).toInt();
          i < (item.x1 * xCoefficient).toInt();
          i++) {
        for (int j = (400 - item.y * yCoefficient).toInt();
            j < (400 - item.y2 * yCoefficient).toInt();
            j++) {
          g[i][j] = 0;
        }
      }
    }
    List<List<int>> d =
        List.generate(400, (i) => List.generate(400, (i) => -1));
    d[startX][startY] = 0;
    Queue<PointToInt> q = Queue();
    List<int> dx = [-1, 0, 1, 0];
    List<int> dy = [0, 1, 0, -1];
    List<String> text = ["上", "左", "下", "右"];
    q.addLast(PointToInt(x: startX, y: startY));
    PointToInt target = PointToInt(x: endX, y: endY);
    while (q.length > 0) {
      PointToInt t = q.first;
      q.removeFirst();
      if (t == target) break;
      for (int i = 0; i < 4; i++) {
        int a = t.x + dx[i];
        int b = t.y + dy[i];
        if (a >= 0 &&
            a < 400 &&
            b >= 0 &&
            b < 400 &&
            g[a][b] != 1 &&
            d[a][b] == -1) {
          d[a][b] = d[t.x][t.y] + 1;
          path[a][b] = Tuple3(t.x, t.y, text[i]);
          q.add(PointToInt(x: a, y: b));
        }
      }
    }
    print(d[endX][endY]);
    while (d[endX][endY] > 0) {
      PointToInt start = PointToInt(x: endX, y: endY);
      var t = path[endX][endY];

      endX = t.item1;
      endY = t.item2;
      PointToInt end = PointToInt(x: endX, y: endY);
      if (endX != -1 && endY != -1) {
        drawLine(canvas, start, end);
      }
    }
  }

  drawLine(Canvas canvas, PointToInt start, PointToInt end) {
    final pointMode = ui.PointMode.polygon;
    final paint = Paint()
      ..color = Colors.green
      ..strokeWidth = 4;
    canvas.drawLine(Offset(start.x.toDouble(), start.y.toDouble()),
        Offset(end.x.toDouble(), end.y.toDouble()), paint);
  }

  drawPoint(Canvas canvas, Size size, double x, double y, String text,
      Color textColor, Color pointColor, double pointSize) {
    painter
      ..style = PaintingStyle.fill
      ..color = pointColor;
    canvas.drawCircle(
      Offset(x * xCoefficient, size.height - y * yCoefficient),
      pointSize,
      painter,
    );
    final textStyle = ui.TextStyle(
      color: textColor,
      fontSize: 14,
    );
    final paragraphStyle = ui.ParagraphStyle(
      textDirection: TextDirection.ltr,
    );
    final paragraphBuilder = ui.ParagraphBuilder(paragraphStyle)
      ..pushStyle(textStyle)
      ..addText(text);
    final constraints = ui.ParagraphConstraints(width: 300);
    final paragraph = paragraphBuilder.build();
    paragraph.layout(constraints);
    canvas.drawParagraph(paragraph,
        Offset(x * xCoefficient - 9, size.height - y * yCoefficient - 15));
  }

  @override
  bool shouldRepaint(CustomPainter oldDelegate) {
    return false;
  }
}
