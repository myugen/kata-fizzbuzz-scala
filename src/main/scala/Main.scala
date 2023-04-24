package dev.mcabsan.fizzbuzz

@main def run(): Unit =
  (1 to 100).map(fizzbuzz).foreach(println)
