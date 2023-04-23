package dev.mcabsan

object FizzRules {
  private val FIZZ = "fizz"

  def whenDivisibleByThree: PartialFunction[Int, String] = Helpers.callWhenIsDivisibleBy(3, _ => FIZZ)

  def whenContainsThree: PartialFunction[Int, String] = Helpers.callWhenContainsDigit(3, _ => FIZZ)
}
