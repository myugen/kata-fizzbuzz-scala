package dev.mcabsan.fizzbuzz

def fizzbuzz = (n: Int) =>
  Seq(
    FizzRules.whenDivisibleByThree,
    FizzRules.whenContainsThree,
    BuzzRules.whenDivisibleByFive,
    BuzzRules.whenContainsFive
  )
    .collect {
      case f if f.isDefinedAt(n) => f(n)
    } match {
    case result if result.nonEmpty => result.mkString
    case _                         => DefaultRule.asString(n)
  }
