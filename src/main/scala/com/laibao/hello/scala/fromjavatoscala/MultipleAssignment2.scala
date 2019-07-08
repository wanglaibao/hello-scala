package com.laibao.hello.scala.fromjavatoscala

object MultipleAssignment2 extends App{

  def getPersonInfo(primaryKey: Int): (String, String, String) = {
    ("Venkat", "Subramaniam", "venkats@agiledeveloper.com")
  }

  //val (firstName, lastName) = getPersonInfo(1)

  /**
    * 那么 Scala 将会报错，如下所示：
      MultipleAssignment2.scala:5: error: constructor cannot be instantiated to
      expected type;
      found : (T1, T2)
      required: (String, String, String)
      val (firstName, lastName) = getPersonInfo(1)
      one error found
    */
}
