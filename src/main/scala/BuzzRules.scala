package dev.mcabsan

object BuzzRules {
  private val BUZZ = "buzz"

  def whenDivisibleByFive: PartialFunction[Int, String] = Helpers.callWhenIsDivisibleBy(5, _ => BUZZ)

  def whenContainsFive: PartialFunction[Int, String] = Helpers.callWhenContainsDigit(5, _ => BUZZ)
}
