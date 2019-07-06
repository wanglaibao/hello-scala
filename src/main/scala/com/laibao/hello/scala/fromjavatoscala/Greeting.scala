package com.laibao.hello.scala.fromjavatoscala

object Greeting{

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3) {
      print(s"$i,")
    }
    println("Scala Rocks!!!")
  }
}
