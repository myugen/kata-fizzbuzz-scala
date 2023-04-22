package dev.mcabsan

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FizzBuzzShould extends AnyFunSuite with Matchers {
  private case class Case(name: String, input: Int, expected: String)

  private val cases = Seq(
    Case("return fizz when number is divisible by 3", 3, "fizz"),
    Case("return fizz when number contains 3", 13, "fizz"),
    Case("return buzz when number is divisible by 5", 5, "buzz"),
    Case("return buzz when number contains 5", 52, "buzz"),
    Case("return fizzbuzz when number is divisible by 3 and 5", 15, "fizzbuzz"),
    Case("return fizzbuzz when number contains 3 and 5", 35, "fizzbuzz"),
    Case("return current number when number is not divisible by 3 or 5 and does not contain 3 or 5", 1, "1"),
  )

  for (Case(name, input, expected) <- cases) {
    test(name) {
      val actual = Fizzbuzz.count(input)

      actual should be(expected)
    }
  }
}
