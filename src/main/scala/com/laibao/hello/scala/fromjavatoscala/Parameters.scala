package com.laibao.hello.scala.fromjavatoscala

object Parameters extends App{
    def max(values: Int*) = values.foldLeft(values(0)) { Math.max }

    def min(values:Int*):Int = values.foldLeft(values(0)){Math.min}

    println(max(8, 2, 3))
    println(max(2, 5, 3, 7, 1, 6))

    function(1, 2, 3)

    def function(input: Int*): Unit = println(input.getClass)

    val numbers = Array(2, 5, 3, 7, 1, 6)
    function(numbers: _*)
}
