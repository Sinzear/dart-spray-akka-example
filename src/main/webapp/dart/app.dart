library app;

import 'dart:convert';
import 'dart:html';
import 'model.dart' show Task;

void main() {
  UListElement container = querySelector('#container');
  HttpRequest.getString('http://localhost:3000/api/tasks').then((res) {
    List taskJsonList = JSON.decode(res);
    taskJsonList.forEach((taskAsJson) {
      Task newTask = new Task.fromJson(taskAsJson);
      container.children.add(
        new LIElement()..children.addAll([
          new HeadingElement.h3()..text = newTask.assignee,
          new SpanElement()..text = newTask.content,
          new BRElement(),
          new BRElement()
        ])
      );
    });
  });
}