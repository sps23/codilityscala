package silverstar.codility.lessons.lesson9

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class MaxProfitSpec extends AnyFunSpec with Matchers {

  import MaxProfit._

  private val MinN = 0
  private val MaxN = 400000
  private val MinA = 0
  private val MaxA = 200000

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(23171, 21011, 21123, 21366, 21013, 21367), 356),
    (Array(23171, 21013, 21123, 21366, 21011, 21367), 356),
    (Array(10, 9, 8, 7), 0),
    (Array(10), 0),
    (Array(9, 10), 1),
    (Array(MinA, MinA, MinA), 0),
    (Array(MaxA, MaxA, MaxA), 0),
    ((1 to MaxA).toArray, MaxA - 1),
    ((1 to MaxA).reverse.toArray, 0),
    ((1 to MinN).toArray, 0),
    ((1 to MaxN).map(_ => MaxA).toArray, 0)
  )

  describe("maxProfit") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1.take(10).mkString("[", ";", "]")}") {
        maxProfit(t._1) shouldBe t._2
      }
    }
  }
}
