package com.gerdriesselmann.sbttest.test

import org.scalatest.{Assertions, Spec}
import com.gerdriesselmann.sbttest.TheClass

class LinkSpec extends Spec with Assertions {
  describe("Test") {
    assert(TheClass.test)
  }
}
