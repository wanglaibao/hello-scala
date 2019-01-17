package com.laibao.hello.scala

import com.laibao.hello.java.SimpleJavaClass

object SimpleJavaClassTestDemo {

  def main(args: Array[String]): Unit = {

    // Calling Java static methods
    val x = SimpleJavaClass.create("Test")

    //Calling Java methods
    x.getName()

    println(x.getName())


    // Using Java constructor
    val y = new SimpleJavaClass("Tesasdfasfdasfdt")

    //Calling Java methods
    y.getName()

    println(y.getName())
  }
}
