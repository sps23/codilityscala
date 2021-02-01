package silverstar.codility.lessons.lesson4

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class PermCheckSpec extends AnyFunSpec with Matchers {

  describe("PermCheck isPermutation") {

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

    it(
      "returns 0 for big array of 100,000 elements all the same values equal to 100,000"
    ) {
      val array: Array[Int] = (1 to 100000).map(e => 100000).toArray
      PermCheck.isPermutation(array) shouldBe 0
    }

    it(
      "returns 0 when total sum is correct and it is not permutation for [4, 1, 4, 1]"
    ) {
      PermCheck.isPermutation(Array(4, 1, 4, 1)) shouldBe 0
    }

    it(
      "returns 0 when total sum is correct and it is not permutation for big array"
    ) {
      val array1: Array[Int] = (2 to 100000).map(e => 1).toArray
      val array: Array[Int] = array1 :+ ((1 to 100000).sum - array1.sum)
      PermCheck.isPermutation(array) shouldBe 0
    }
  }
}
