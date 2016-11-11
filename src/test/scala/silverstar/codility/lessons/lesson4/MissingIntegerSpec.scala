package silverstar.codility.lessons.lesson4

import java.util

import org.scalatest.{FunSpec, Matchers}

class MissingIntegerSpec extends FunSpec with Matchers {

  import MissingInteger._

  val MaxN = 100000
  val MinA = Integer.MIN_VALUE
  val MaxA = Integer.MAX_VALUE

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(1, 3, 6, 4, 1, 2), 5),
    ((1 to MaxN).toArray, MaxN + 1),
    ((2 to MaxN).reverse.toArray, 1),
    ((0 until MaxN).map(MaxA - _).toArray, 1),
    ((0 until MaxN).map(MinA + _).toArray, 1)
  )

  describe("missingIntegerIter") {
    for (t <- testData) {
      it(s"should return '${t._2}' for '${util.Arrays.toString(t._1)}'") {
        missingIntegerIter(t._1) shouldBe t._2
      }
    }
  }

  describe("missingIntegerRec") {
    for (t <- testData) {
      it(s"should return '${t._2}' for '${util.Arrays.toString(t._1)}'") {
        missingIntegerRec(t._1) shouldBe t._2
      }
    }
  }
}
