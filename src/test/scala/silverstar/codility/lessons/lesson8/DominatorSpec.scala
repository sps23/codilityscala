package silverstar.codility.lessons.lesson8

import org.scalatest.{FunSpec, Matchers}

class DominatorSpec extends FunSpec with Matchers {

  import Dominator._

  val MaxN = 100000
  val MaxA = Integer.MAX_VALUE
  val MinA = Integer.MIN_VALUE

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(3, 4, 3, 2, 3, -1, 3, 3), 0),
    (Array(4, 2, -1, 3, 3, 3, 3, 3), 3),
    (Array(3, 4, 3, 2, 3, -1, 3, 1), -1),
    (Array(3, 4, 3, 4, 3, 4, 3, 4), -1),
    (Array(1, 2, 3, 4, 5, 6, 7, 8, 9), -1),
    ((1 to MaxN).map(_ => 100).toArray, 0),
    ((1 to MaxN).map(_ => MaxA).toArray, 0),
    ((1 to MaxN).map(_ => MinA).toArray, 0)
  )

  describe("dominator") {
    for (t <- testData) {
      it(s"should return '${t._2}' for a=${t._1.mkString("[", ";", "]")}") {
        dominator(t._1) shouldBe t._2
      }
    }
  }

}
