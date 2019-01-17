package com.laibao.hello.scala

object Predicates {

  def or[T](f1: T => Boolean, f2: T => Boolean) = (t: T) => f1(t) || f2(t)

  def and[T](f1: T => Boolean, f2: T => Boolean) = (t: T) => f1(t) && f2(t)

}
