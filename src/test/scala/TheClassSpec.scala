package com.gerdriesselmann.sbttest.test

import org.scalatest.{Assertions, Spec}
import com.gerdriesselmann.sbttest.TheClass

class LinkSpec extends Spec with Assertions {
  TheClass.start()
  describe("Test") {
    assert(TheClass.test)
  }
}
