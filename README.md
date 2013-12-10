Scala/Spray/Akka/Dart
===

This is a very rudimentary application&mdash;I'll eventually turn it into a Giter8 template&mdash;that is intended to demonstrate how to get Scala/Spray/Akka to work nicely with Dart. Fortunately, it's not that hard to get started. You just need to be aware of a few things.

The key (and sticking point for me initially) is to use Spray's `getFromDirectory` directive to serve up the directory in which your Dart application is housed (in this case `src/main/webapp`). Once you've done that, you need to navigate to the following directory in Chromium (or another browser running the Dart VM):

    http://localhost:3000/index.html

The one other functioning REST endpoint is the `/api/tasks` endpoint, which will simply deliver up a JSON array as a string. This string will be consumed by the Dart application and used to render a simple `<ul>` containing three tasks.

### Getting Started

First things first, make sure that you've installed SBT and Chromium. If so, all you need to do is run `sbt run` and then navigate to the URL mentioned above in Chromium.

### Things to Notice

* In the `Application.scala` file, 