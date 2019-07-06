package com.laibao.hello.scala.introduction

/**
  * 寻找最大值
  */
object FindMaxValue {

  def FindMaxImperativeWay(temperatures: List[Int]):Int = {
        var highTemperature = Integer.MIN_VALUE
        for (temperature <- temperatures) {
              highTemperature = Math.max(highTemperature, temperature)
        }
        highTemperature
  }

  def FindMaxFunctionalWay(temperatures: List[Int]) = temperatures.foldLeft(Integer.MIN_VALUE){Math.max}//temperatures.foldLeft(Integer.MIN_VALUE) { (maxValue,element) =>Math.max(maxValue,element) }

}
