package silverstar.codility.lessons.lesson10

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class CountFactorsSpec extends AnyFunSpec with Matchers {

  import CountFactors._

  private val MinN = 0
  private val MaxN = Int.MaxValue

  val testData: Seq[(Int, Int, Seq[Int])] = Seq(
    (24, 8, Seq(1, 2, 3, 4, 6, 8, 12, 24)),
    (25, 3, Seq(1, 5, 25)),
    (3, 2, Seq(1, 3)),
    (13, 2, Seq(1, 13)),
    (30, 8, Seq(1, 2, 3, 5, 6, 10, 15, 30)),
    (1, 1, Seq(1)),
    (MinN, 0, Seq()),
    (MaxN, 2, Seq(1, MaxN))
  )

  describe("CountFactors - complexity O(n)") {
    describe("numberOfFactorsSlow") {
      for (t <- testData) {
        it(s"should return '${t._2.toString}' for ${t._1.toString}") {
          numberOfFactorsSlow(t._1) shouldBe t._2
        }
      }
    }

    describe("factorsSlow") {
      for (t <- testData) {
        it(s"should return '${t._3.mkString("[", "; ", "]")}' for ${t._1.toString}") {
          factorsSlow(t._1) shouldBe t._3
        }
      }
    }
  }

  describe("CountFactors - complexity O(sqrt(n))") {
    describe("numberOfFactors") {
      for (t <- testData) {
        it(s"should return '${t._2.toString}' for ${t._1.toString}") {
          numberOfFactors(t._1) shouldBe t._2
        }
      }
    }

    describe("factors") {
      for (t <- testData) {
        it(s"should return '${t._3.mkString("[", "; ", "]")}' for ${t._1.toString}") {
          factors(t._1).sorted shouldBe t._3
        }
      }
    }
  }
}
