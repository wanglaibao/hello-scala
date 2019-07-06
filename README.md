# HELLO-SCALA

``
    函数式编程提倡不可变性,高阶函数和函数组合
`


## A BETTER NETWORK RESOURCE TO STEP BY STEP TO SCALA LEARNING 

* http://hello-scala.com

##  A FEW IMPORTANT THINGS TO KNOW ABOUT SCALA

* It’s a modern jvm platform programming language created by Martin Odersky (the father of javac), and influenced by Java, Ruby, Smalltalk, ML, Haskell, Erlang, and others.

* It's a high level language

* It’s statically typed

* It’s syntax is concise but still readable — we call it expressive

* It’s a pure object-oriented programming (OOP) language. Every variable is an object, and every operator is a method.

* It’s also a functional programming (FP) language, so functions are also variables, and we can pass them into other functions. We can write our code using OOP, FP, or combine them in a hybrid style.

* It has a sophisticated type inference system

* It has traits, which are a combination of interfaces and abstract classes that can be used as mixins, and support a modular programming style

* Scala source code compiles to .class files that run on the JVM.

* Scala also works extremely well with the thousands of Java libraries that have been developed over the years.

* A great thing about Scala is that we can be productive with it soon, but it’s also a deep language, so as we go along we’ll keep learning, and finding newer, better ways to write code. It’s said that Scala will change the way we think about programming (and that’s a good thing).

* Of all of Scala’s benefits, what we like best is that it lets we write concise, readable code. The time a programmer spends reading code compared to the time spent writing code is said to be at least a 10:1 ratio, so writing code that’s concise and readable is a big deal. Because Scala has these attributes, programmers say that it’s expressive.

* The [Akka library] (https://akka.io/) provides an Actors API, which was originally based on the actors concurrency model built into Erlang

* The [Play Framework] (https://www.playframework.com/) is a lightweight, stateless, web development framework that’s built with Scala and Akka. (In addition to Play there are several other popular web frameworks.)


## THE DIFFERENCE BETWEEN VAL AND VAR

* The difference between val and var is that val makes a variable immutable — like final in Java — and var makes a variable mutable. Because val fields can’t vary, some people refer to them as values rather than variables.

## THE TYPE IS OPTIONAL

* In most cases our code is easier to read when we leave the type off, so this implicit form is preferred

* The explicit form feels verbose

* Use the explicit form when we need to be clear

## A FEW BUILT-IN TYPES

* if we don’t explicitly specify a type, the number 1 will default to an Int, so if we want one of the other data types — Byte, Long, or Short — we need to explicitly declare those types;Numbers with a decimal (like 2.0) will default to a Double, so if we want a Float we need to declare a Float.

* because Int and Double are the default numeric types, we typically create them without explicitly declaring the data type

## BIGINT AND BIGDECIMAL

* for large numbers Scala also includes the types BigInt and BigDecimal:

* eg: val b = BigInt(1234567890)

* eg: val b = BigDecimal(121231233456.123789)

## CHAR AND STRING 

* Scala also has Char and String data types, which we always declare with the implicit form
    
    val c = 'A'
    
    val name = "金戈"
    
* We can use the explicit form, if we prefer

    val c:Char = 'A'
    
    val name:String = "金戈"

## STRINGS TEMPLATE AND MULTILINE STRINGS

* The first feature is that Scala has a nice, Ruby-like way to merge multiple strings, that feature is known as string interpolation.

* A second great feature of Scala strings is that you can create multiline strings by including the string inside three parentheses.


## BETTER ARTICLES

* [How to disassemble and decompile Scala code] (https://alvinalexander.com/scala/how-to-disassemble-decompile-scala-source-code-javap-scalac-jad)

* [Getting started with the Scala REPL] (https://alvinalexander.com/scala/getting-started-scala-repl-command-line-shell-options)

* [How to handle very large numbers in Scala (BigInt, BigDecimal)] (https://alvinalexander.com/scala/how-handle-very-large-numbers-scala-bigint-bigdecimal)

* [Reakt Reactive Java] (http://advantageous.github.io/reakt/)
* [EasyKotlin/reakt] (https://github.com/EasyKotlin/reakt)
* [andrewoma/reakt] (https://github.com/andrewoma/reakt)
* [并发编程 Promise, Future 和 Callback] (http://ifeve.com/promise-future-callback/)
* [Java8新的异步编程方式 CompletableFuture] (https://www.jianshu.com/p/dff9063e1ab6)
* [jdeferred/jdeferred] (https://github.com/jdeferred/jdeferred)
* [JDeferred] (http://jdeferred.org/)
* [Java的Deferred/Promise类库：JDeferred] (https://www.open-open.com/lib/view/open1384266764383.html)
* [Java 8 新特性：Java 类库的新特性之 Stream类] (https://blog.csdn.net/sun_promise/article/details/51480257)
* [Monadic futures in Java 8: How to organize your data flow and avoid callback hell] (https://jrebel.com/rebellabs/monadic-futures-in-java8/)
* [Marius Herring] (https://github.com/mariushe)
* [Java 8: Writing asynchronous code with CompletableFuture] (https://www.deadcoderising.com/java8-writing-asynchronous-code-with-completablefuture/)
* [Programming Promises in Java 8] (https://coderprog.com/programming-promises-java-8/)
* [Java 8 Functional Interfaces] (https://www.journaldev.com/2763/java-8-functional-interfaces)
* [Futures and Promises] (http://dist-prog-book.com/chapter/2/futures.html)
* [shelajev/promises] (https://github.com/shelajev/promises)

* [人必自侮而后人侮之]
