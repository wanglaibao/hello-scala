package com.laibao.hello.scala

object CatAndBirdDemo {

  def main(args: Array[String]): Unit = {
    val cat = new Cat
    val bird = new Bird
    cat.cape(bird)
    cat.eat()
  }
}
