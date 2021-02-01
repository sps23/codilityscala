package silverstar.codility.lessons.lesson3

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class PermMissingElemSpec extends AnyFunSpec with Matchers {

  describe("PermMissingElem missingElem") {

    it("returns 4 for [2, 3, 1, 5]") {
      PermMissingElem.missingElem(Array(2, 3, 1, 5)) shouldBe 4
    }

    it("returns 1 for []") {
      PermMissingElem.missingElem(Array()) shouldBe 1
    }

    it("returns 1 for big array") {
      val array: Array[Int] = (2 to 10000).toArray
      PermMissingElem.missingElem(array) shouldBe 1
    }
  }

}
