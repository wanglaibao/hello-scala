package com.laibao.hello.scala

object HelloArgsApp extends App{
  if (args.size == 0) println("Hello, World") else println("Hello, " + args(0))
  println()
  val name = "John Doe"
  println()
  println("hello".head)
  println()
  println("hello".tail)
  println()
  println("hello, world".take(5))
  println()
  println("hi")
  println(1 + 2 * 3)
  println()
  println((1 + 2) * 3)
  println()
  println(if (2 > 1) println("greater") else println("lesser"))
}
