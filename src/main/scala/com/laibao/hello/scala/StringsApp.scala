package com.laibao.hello.scala

object StringsApp extends App{

  val firstName = "金"
  val mi = 'A'
  val lastName = "戈"

  val name0 = firstName + " " + mi + " " + lastName
  val name1 = s"名称是 $firstName $mi $lastName"

  println(s"Name is $firstName $mi $lastName")
  println()
  println(name1)

  val speech = """Four score and
                 |seven years ago
                 |our fathers ...""".stripMargin

  println(speech)
}
