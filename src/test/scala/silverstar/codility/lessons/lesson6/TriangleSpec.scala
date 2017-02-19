package silverstar.codility.lessons.lesson6

import org.scalatest.{FunSpec, Matchers}

class TriangleSpec extends FunSpec with Matchers {

  import Triangle._

  private val MinN = 0
  private val MaxN = 100000
  private val MinA = Integer.MIN_VALUE
  private val MaxA = Integer.MAX_VALUE

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(10, 2, 5, 1, 8, 20), 1),
    (Array(10, 50, 5, 1), 0),
    (Array(10, 10, 10), 1),
    (Array(MinA, MinA, MinA), 0),
    (Array(MaxA, MaxA, MaxA), 1),
    ((1 to MinN).toArray, 0),
    ((1 to MaxN).toArray, 1)
  )

  describe("hasTriangularTriplet") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1.mkString("[", ";", "]")}") {
        hasTriangularTriplet(t._1) shouldBe t._2
      }
    }
  }
}
