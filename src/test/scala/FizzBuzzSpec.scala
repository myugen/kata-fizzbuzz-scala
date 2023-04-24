package dev.mcabsan.fizzbuzz

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FizzBuzzSpec extends AnyFunSpec with Matchers {
  private case class Case(name: String, input: Int, expected: String)

  describe("fizzbuzz") {
    Seq(
      Case("should show current number when number is not divisible by 3", 1, "1"),
      Case("should show fizz when number is divisible by 3", 6, "fizz"),
      Case("should show fizz when number contains 3", 13, "fizz"),
      Case("should show fizzfizz when number is divisible by 3 and contains 3", 3, "fizzfizz"),
      Case("return buzz when number is divisible by 5", 20, "buzz"),
      Case("return buzzbuzz when number is divisible by 5 and contains 5", 5, "buzzbuzz"),
      Case("return fizzbuzzbuzz when number is divisible by 3 and 5 and contains 5", 15, "fizzbuzzbuzz"),
      Case("return fizzfizzbuzz when number is divisible by 3 and 5 and contains 3", 30, "fizzfizzbuzz"),
    ).foreach { cases =>
      it(cases.name) {
        fizzbuzz(cases.input) should be(cases.expected)
      }
    }
  }
}
