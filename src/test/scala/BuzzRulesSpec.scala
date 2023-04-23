package dev.mcabsan

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class BuzzRulesSpec extends AnyFunSpec with Matchers {
  describe("whenDivisibleByFive") {
    it("should show buzz when number is divisible by 5") {
      BuzzRules.whenDivisibleByFive(5) should be("buzz")
    }

    it("should throw error when number is not divisible by 5") {
      an[MatchError] should be thrownBy BuzzRules.whenDivisibleByFive(2)
    }
  }

  describe("whenContainsFive") {
    it("should show buzz when number contains 5") {
      BuzzRules.whenContainsFive(5) should be("buzz")
    }

    it("should throw error when number does not contain 5") {
      an[MatchError] should be thrownBy BuzzRules.whenContainsFive(2)
    }
  }
}
