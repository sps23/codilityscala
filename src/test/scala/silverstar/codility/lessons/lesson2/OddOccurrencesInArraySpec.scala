package silverstar.codility.lessons.lesson2

import org.scalatest.FunSpec
import org.scalatest.Matchers._

class OddOccurrencesInArraySpec extends FunSpec {

  describe("OddOccurrencesInArray oddOccurrence") {

    it("returns 7 for [9, 3, 9, 3, 9, 7, 9]") {
      OddOccurrencesInArray.oddOccurrence(Array(9, 3, 9, 3, 9, 7, 9)) shouldBe 7
    }

    it("returns 9 for [9, 3, 9, 3, 9, 7, 9, 7, 9]") {
      OddOccurrencesInArray.oddOccurrence(Array(9, 3, 9, 3, 9, 7, 9, 7, 9)) shouldBe 9
    }
  }
}
