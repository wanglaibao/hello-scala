package com.laibao.hello.scala.fromjavatoscala

object DefaultValues {

  def mail(destination: String = "head office", mailClass: String = "first"): Unit = println(s"sending to $destination by $mailClass class")

  def main(args: Array[String]): Unit = {
    mail("Houston office", "Priority")
    mail("Boston office")
    mail()
  }
}
