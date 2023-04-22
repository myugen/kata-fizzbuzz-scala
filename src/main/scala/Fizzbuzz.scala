package dev.mcabsan

extension (n: Int)
  private def isDivisibleBy(divisor: Int): Boolean =
    n % divisor == 0

  private def containsAllOf(digits: Int*): Boolean =
    digits.forall(digit => n.toString.contains(digit.toString))

object Fizzbuzz {
  def count(number: Int): String = number match
    case n if n.isDivisibleBy(15) || n.containsAllOf(3, 5) => "fizzbuzz"
    case n if n.isDivisibleBy(3) || n.containsAllOf(3) => "fizz"
    case n if n.isDivisibleBy(5) || n.containsAllOf(5) => "buzz"
    case _ => number.toString
}
