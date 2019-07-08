package com.laibao.hello.scala.fromjavatoscala

class Complex private (val real: Int, val imaginary: Int){

  def +(operand: Complex): Complex = new Complex(real + operand.real, imaginary + operand.imaginary)


  override def toString: String = {
    val sign = if (imaginary < 0) "" else "+"

    s"$real$sign${imaginary}i"

  }
}

object Complex {

  def main(args: Array[String]): Unit = {

    val c1 = new Complex(1, 2)

    val c2 = new Complex(2, -3)

    val sum = c1 + c2

    println(s"($c1) + ($c2) = $sum")
  }

}
