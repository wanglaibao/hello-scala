package com.laibao.hello.scala.fromjavatoscala

import java.util

class ScalaInt {

  def playWithInt(): Unit = {
    val capacity: Int = 10
    val list = new util.ArrayList[String]
    list.ensureCapacity(capacity)
  }
}
