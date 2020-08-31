import 'dart:io';

class DataStorage {
  Future<String> get _localPath async {
    return "/storage/emulated/0/Download";
  }

  Future<File> get _localFile async {
    final path = await _localPath;
    return File('$path/Data.txt');
  }

  Future<List<String>> readData() async {
    try {
      final file = await _localFile;

      String data = await file.readAsString();
      return data.split("\n");
    } catch (e) {
      return [""];
    }
  }

  Future<File> writeData(
      int thead, String position, String bluetoothData) async {
    final file = await _localFile;
    DateTime now = new DateTime.now();
    DateTime date = new DateTime(now.year, now.month, now.day, now.hour,
        now.minute, now.second, now.millisecond);
    return file.writeAsString(thead.toString() +
        "\n" +
        position +
        "\n" +
        date.toString() +
        "\n" +
        bluetoothData);
  }

  Future<File> writeNext(int thead, String position) async {
    final file = await _localFile;
    print("Thead Change:" + thead.toString());
    return file.writeAsString(thead.toString() + "\n" + position);
  }
}
