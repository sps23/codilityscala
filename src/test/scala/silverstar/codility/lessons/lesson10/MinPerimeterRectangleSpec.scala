package silverstar.codility.lessons.lesson10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class MinPerimeterRectangleSpec extends AnyFunSpec with Matchers {

  import MinPerimeterRectangle._

  private val MinN = 1
  private val MaxN = 1000000000

  val testData: Seq[(Int, Int)] = Seq(
    (30, 22),
    (31, 2 * (1 + 31)),
    (100, 2 * (10 + 10)),
    (MinN, 2 * (MinN + MinN)),
    (MaxN, 2 * (31250 + 32000))
  )

  describe("minPerimeter") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1}") {
        minPerimeter(t._1) shouldBe t._2
      }
    }
  }

  describe("minPerimeterSlow") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1}") {
        minPerimeterSlow(t._1) shouldBe t._2
      }
    }
  }

  describe("minPerimeterFold") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1}") {
        minPerimeterFold(t._1) shouldBe t._2
      }
    }
  }
}
