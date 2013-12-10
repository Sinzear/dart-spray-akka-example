package server

import spray.json._
import DefaultJsonProtocol._

import models.Task

trait MainServer extends WebService {
  implicit val taskJsonFormat = jsonFormat3(Task)

  val tasks: List[Task] = List(
    new Task(1, "developers", "improve the internet"),
    new Task(2, "the Messiah", "save us all"),
    new Task(3, "Miss Manners", "improve our daily practices")
  )

  val tasksAsJsonString: String = tasks.toJson.toString

  val mainRoutes = {
    pathPrefix("") {
      getFromDirectory("src/main/webapp")
    } ~
    pathPrefix("api") {
      path("tasks") {
        complete(tasksAsJsonString)
      }
    }
  }
}