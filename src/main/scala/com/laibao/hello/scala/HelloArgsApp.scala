package com.laibao.hello.scala

object HelloArgsApp extends App{

  if (args.size == 0) println("Hello, World") else println("Hello, " + args(0))

}
