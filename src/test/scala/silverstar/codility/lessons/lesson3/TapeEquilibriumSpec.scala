package silverstar.codility.lessons.lesson3

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class TapeEquilibriumSpec extends FunSpec {

  describe("TapeEquilibrium minimalDifference") {

    it("returns 1 for [3, 1, 2, 4, 3]") {
      TapeEquilibrium.minimalDifference(Array(3, 1, 2, 4, 3)) shouldBe 1
    }

    it("returns 2 for [3, 1]") {
      TapeEquilibrium.minimalDifference(Array(3, 1)) shouldBe 2
    }

    it("returns 0 for [3, 3, 3, 3, 3, 3, 3, 3]") {
      TapeEquilibrium.minimalDifference(Array(3, 3, 3, 3, 3, 3, 3, 3)) shouldBe 0
    }

    it("returns 0 for big array with same elements") {
      val array: Array[Int] = (1 to 100000).map(e => 3).toArray
      TapeEquilibrium.minimalDifference(array) shouldBe 0
    }
  }
}
