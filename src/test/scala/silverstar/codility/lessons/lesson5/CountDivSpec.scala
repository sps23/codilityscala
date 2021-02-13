package silverstar.codility.lessons.lesson5

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CountDivSpec extends AnyFunSpec with Matchers {

  import CountDiv._

  private val MinA = 0
  private val MaxA = 2000000000
  private val MinB = 1
  private val MaxB = 2000000000
  private val MinK = 1
  private val MaxK = 2000000000

  val testData: Seq[((Int, Int, Int), Int)] = Seq(
    ((6, 11, 2), 3),
    ((7, 7 * 7, 7), 7),
    ((7 + 1, 7 * 7, 7), 6),
    ((10, 10, 2), 1),
    ((10, 10, 10), 1),
    ((5, 5, 7), 0),
    ((1, 5000, MinK), 5000),
    ((1, 1000000, MinK), 1000000),
    ((MinA, MinB, 10), 1),
    ((MaxA, MaxB, MaxK), 1),
    ((MinA, MaxB, 2), (MaxB / 2) + 1)
  )

  describe("numberOfDiv") {
    for (t <- testData) {
      it(s"should return '${t._2.toString}' for '${t._1.toString}'") {
        numberOfDiv(t._1._1, t._1._2, t._1._3) shouldBe t._2
      }
    }
  }

  describe("numberOfDivSeq") {
    for (t <- testData) {
      it(s"should return '${t._2.toString}' for '${t._1.toString}'") {
        numberOfDivSeq(t._1._1, t._1._2, t._1._3) shouldBe t._2
      }
    }
  }

  describe("numberOfDivPar") {
    for (t <- testData) {
      it(s"should return '${t._2.toString}' for '${t._1.toString}'") {
        numberOfDivPar(t._1._1, t._1._2, t._1._3) shouldBe t._2
      }
    }
  }
}
