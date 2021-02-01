package silverstar.codility.lessons.lesson2

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

/**
  * Tests for OddOccurrencesInArray.
  */
class OddOccurrencesInArraySpec extends AnyFunSpec with Matchers {

  describe("OddOccurrencesInArray oddOccurrence") {

    it("returns 7 for [9, 3, 9, 3, 9, 7, 9]") {
      OddOccurrencesInArray.oddOccurrence(Array(9, 3, 9, 3, 9, 7, 9)) shouldBe 7
    }

    it("returns 9 for [9, 3, 9, 3, 9, 7, 9, 7, 9]") {
      OddOccurrencesInArray.oddOccurrence(Array(9, 3, 9, 3, 9, 7, 9, 7, 9)) shouldBe 9
    }

    it("returns correct result for big array with multiple repetitions") {
      val testArray = (1 to 10000).toArray
      val array
        : Array[Int] = testArray ++ testArray ++ testArray ++ testArray ++ testArray ++ testArray :+ 1
      OddOccurrencesInArray.oddOccurrence(array) shouldBe 1
    }

    it("returns correct result for big array") {
      val array: Array[Int] = (1 to 50000).toArray ++ (1 to 50000) :+ 1
      OddOccurrencesInArray.oddOccurrence(array) shouldBe 1
    }
  }
}
