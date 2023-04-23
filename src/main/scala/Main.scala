package dev.mcabsan

@main def run(): Unit =
  (1 to 100).map(fizzbuzz).foreach(println)
