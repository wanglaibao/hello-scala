package com.laibao.hello.scala.fromjavatoscala

object Parameters extends App{
    def max(values: Int*) = values.foldLeft(values(0)) { Math.max }

    println(max(8, 2, 3))
}
