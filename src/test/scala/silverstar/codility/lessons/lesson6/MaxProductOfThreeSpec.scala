package silverstar.codility.lessons.lesson6

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class MaxProductOfThreeSpec extends AnyFunSpec with Matchers {

  import MaxProductOfThree._

  private val MinN = 3
  private val MaxN = 100000
  private val MinA = -10000
  private val MaxA = 10000

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(-3, 1, 2, -2, 5, 6), 60),
    (Array(-2, 1, 5, -3, 2, 6), 60),
    (Array(-3, -1, -2, -2, -5, -6), -4),
    (Array(3, 1, 2, 2, 5, 6), 90),
    (Array(-3, -2, 1, 3, 4), 24),
    ((1 to MinN).toArray, 6),
    ((1 to MinN).map(_ * -1).toArray, -6),
    ((1 to MaxN).toArray, MaxN * (MaxN - 1) * (MaxN - 2)),
    ((1 to MaxN).reverse.toArray, MaxN * (MaxN - 1) * (MaxN - 2)),
    ((MinA to MaxA).toArray, -MaxA * (-MaxA + 1) * MaxA)
  )

  describe("maxProductTriplet") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1.mkString("[", ";", "]")}") {
        maxProductTriplet(t._1) shouldBe t._2
      }
    }
  }
}
