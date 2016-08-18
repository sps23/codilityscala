package silverstar.codility.lessons.lesson2

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class CyclicRotationSpec extends FunSpec {

  describe("CyclicRotation rotate") {

    it("returns [9, 7, 6, 3, 8] for [3, 8, 9, 7, 6] rotated 3 times") {
      CyclicRotation.rotate(Array(3, 8, 9, 7, 6), 3) shouldBe Array(9, 7, 6, 3, 8)
    }

    it("returns [1, 2, 3] for [1, 2, 3] rotated 6 times") {
      CyclicRotation.rotate(Array(1, 2, 3), 6) shouldBe Array(1, 2, 3)
    }

    it("returns [1, 2, 3] for [1, 2, 3] rotated 0 times") {
      CyclicRotation.rotate(Array(1, 2, 3), 0) shouldBe Array(1, 2, 3)
    }

    it("returns [] for [] rotated 3 times") {
      CyclicRotation.rotate(Array(), 3) shouldBe Array()
    }
  }
}
