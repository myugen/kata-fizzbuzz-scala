package dev.mcabsan

object Helpers {
  def callWhenIsDivisibleBy(divisor: Int, callback: Int => String): PartialFunction[Int, String] =
    case n if n % divisor == 0 => callback(n)

  def callWhenContainsDigit(digit: Int, callback: Int => String): PartialFunction[Int, String] =
    case n if n.toString.contains(digit.toString) => callback(n)
}
