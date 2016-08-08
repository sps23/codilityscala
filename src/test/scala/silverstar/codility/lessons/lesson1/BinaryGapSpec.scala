package silverstar.codility.lessons.lesson1

import org.scalatest.FunSpec
import org.scalatest.Matchers._

/**
  * Tests for BinaryGap.
  */
class BinaryGapSpec extends FunSpec {

  describe("BinaryGap binaryGap") {

    it("returns 2 for 9 (1001)") {
      BinaryGap.binaryGap(9) shouldBe 2
    }

    it("returns 4 for 529 (1000010001)") {
      BinaryGap.binaryGap(529) shouldBe 4
    }

    it("returns 1 for 20 (10100)") {
      BinaryGap.binaryGap(20) shouldBe 1
    }

    it("returns 0 for 15 (1111)") {
      BinaryGap.binaryGap(15) shouldBe 0
    }

    it("returns 5 for 1041 (10000010001 )") {
      BinaryGap.binaryGap(1041) shouldBe 5
    }
  }

  describe("BinaryGap binaryGap analysis examples") {

    it("returns 0 for 6 (110)") {
      BinaryGap.binaryGap(6) shouldBe 0
    }

    it("returns 2 for 328 (101001000)") {
      BinaryGap.binaryGap(328) shouldBe 2
    }

    it("returns 3 for 1162 (10010001010)") {
      BinaryGap.binaryGap(1162) shouldBe 3
    }

    it("returns 2 for 51712 (110010100000000)") {
      BinaryGap.binaryGap(51712) shouldBe 2
    }

    it("returns 9 for 66561 (10000010000000001)") {
      BinaryGap.binaryGap(66561) shouldBe 9
    }
  }

  describe("BinaryGap binaryGap power of 2 examples") {

    it("returns 0 for 16 (10000)") {
      BinaryGap.binaryGap(16) shouldBe 0
    }

    it("returns 0 for 1024 (10000000000)") {
      BinaryGap.binaryGap(1024) shouldBe 0
    }
  }
}
