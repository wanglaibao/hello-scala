package com.laibao.hello.scala.introduction

object DoubleValues extends App{
  val values = List(1, 2, 3, 4, 5)
  val doubleValues = values.map(_ * 2)
  doubleValues.foreach(println)
  val funType = (int: Int) => int * 3
  println(funType(1000))

  val flag1 = isPalindrome("mom")
  val flag2 = isPalindrome("dude")

  println(flag1)
  println(flag2)

  def isPalindrome(str: String):Boolean = str == str.reverse

}
