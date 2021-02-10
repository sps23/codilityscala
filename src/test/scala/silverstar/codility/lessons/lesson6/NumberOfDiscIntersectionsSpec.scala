package silverstar.codility.lessons.lesson6

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class NumberOfDiscIntersectionsSpec extends AnyFunSpec with Matchers {

  import NumberOfDiscIntersections._

  private val MinN = 0
  private val MaxN = 100000
  private val MinA = 0

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(1, 5, 2, 1, 4, 0), 11),
    (Array(1, 2147483647, 0), 2),
    (Array(1, 0, 1), 3),
    (Array(1, 0, 0, 1), 2),
    (Array(1), 0),
    (Array(MinA, MinA, MinA), 0),
    (Array(4, 3, 2, 1), 6),
    ((1 to MinN).toArray, 0),
    ((1 to MaxN).toArray, -1),
    ((1 to MaxN).map(_ => MAX).toArray, -1)
  )

  describe("numberOfIntersections") {
    for (t <- testData) {
      it(s"should return '${t._2}' for ${t._1.take(10).mkString("[", ";", "]")}") {
        numberOfIntersections(t._1) shouldBe t._2
      }
    }
  }
}
