package com.gerdriesselmann.sbttest.test

import org.scalatest.{Assertions, Spec}
import package com.gerdriesselmann.sbttest.TheClass

class LinkSpec extends Spec with Assertions {
  describe("Test") {
    assert(TheClass.test)
  }
}
