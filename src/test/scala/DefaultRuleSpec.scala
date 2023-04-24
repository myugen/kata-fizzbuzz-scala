package dev.mcabsan.fizzbuzz

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class DefaultRuleSpec extends AnyFunSpec with Matchers {

  describe("asString") {
    it("should show number as string") {
      DefaultRule.asString(1) should be("1")
    }
  }
}
