package com.laibao.hello.scala

object Iterables {

  def filter[A](unfiltered: Iterable[A], predicate: A => Boolean): Iterable[A] = {
          Nil
  }

  def find[A](iterable: Iterable[A], predicate: A => Boolean): A = {
      iterable.filter(predicate).find(predicate).get
  }

}
