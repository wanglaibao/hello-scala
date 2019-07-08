package com.laibao.hello.scala.fromjavatoscala

class Wifi(name: String) {
  override def toString: String = name
}

object ImplicitParameters {

  def connectToNetwork(user: String)(implicit wifi: Wifi): Unit = {
    println(s"User: $user connected to WIFI $wifi")
  }

  def atOffice(): Unit = {
    println("--- at the office ---")
    implicit def officeNetwork: Wifi = new Wifi("office-network")
    val cafeteriaNetwork = new Wifi("cafe-connect")
    connectToNetwork("guest")(cafeteriaNetwork)
    connectToNetwork("Jill Coder")
    connectToNetwork("Joe Hacker")
  }

  def atJoesHome(): Unit = {
    println("--- at Joe's home ---")
    implicit def homeNetwork: Wifi = new Wifi("home-network")
    connectToNetwork("guest")(homeNetwork)
    connectToNetwork("Joe Hacker")
  }

  def main(args: Array[String]): Unit = {
    atOffice()
    atJoesHome()

    val discount = 10

    var price = 100

    val totalPrice = s"The amount after discount is $$${price * (1 - discount / 100.0)}"

    println(totalPrice)

    price = 50

    println(totalPrice)
  }


}


