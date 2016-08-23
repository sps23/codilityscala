package silverstar.codility.lessons.lesson4

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class PermCheckSpec extends FunSpec {

  describe("PermCheck ") {

    it("returns 1 for [4, 1, 3, 2]") {
      PermCheck.isPermutation(Array(4, 1, 3, 2)) shouldBe 1
    }

    it("returns 0 for [4, 1, 3]") {
      PermCheck.isPermutation(Array(4, 1, 3)) shouldBe 0
    }

    it("returns 1 for big array of 100,000 elements") {
      val array: Array[Int] = (1 to 100000).toArray
      PermCheck.isPermutation(array) shouldBe 1
    }

    it("returns 0 for big array of 100,000 elements") {
      val array: Array[Int] = (2 to 100000).toArray
      PermCheck.isPermutation(array) shouldBe 0
    }

    it("returns 0 for big array of 100,000 elements filled with element equal 100,000") {
      val array: Array[Int] = (1 to 100000).map(e => 1000000000).toArray
      PermCheck.isPermutation(array) shouldBe 0
    }
  }
}
