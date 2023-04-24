package dev.mcabsan.fizzbuzz

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FizzRulesSpec extends AnyFunSpec with Matchers {

  describe("whenDivisibleByThree") {
    it("should show fizz when number is divisible by 3") {
      FizzRules.whenDivisibleByThree(3) should be("fizz")
    }

    it("should throw error when number is not divisible by 3") {
      an[MatchError] should be thrownBy FizzRules.whenDivisibleByThree(2)
    }
  }

  describe("whenContainsThree") {
    it("should show fizz when number contains 3") {
      FizzRules.whenContainsThree(3) should be("fizz")
    }

    it("should throw error when number does not contain 3") {
      an[MatchError] should be thrownBy FizzRules.whenContainsThree(2)
    }
  }
}
