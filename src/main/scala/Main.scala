package dev.mcabsan

@main def run: Unit =
  for i <- 1 to 100 do
    println(Fizzbuzz.count(i))
