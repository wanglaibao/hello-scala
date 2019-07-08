package com.laibao.hello.scala.fromjavatoscala

object MultipleAssignment extends App{

  def getPersonInfo(primaryKey: Int) = {
    // 假定 primaryKey 是用来获取用户信息的主键
    // 这里响应体是固定的
    ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
  }

  val (firstName, lastName, emailAddress) = getPersonInfo(100)

  println(s"First Name: $firstName")

  println(s"Last Name: $lastName")

  println(s"Email Address: $emailAddress")

}
