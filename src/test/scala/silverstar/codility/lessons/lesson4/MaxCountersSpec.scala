package silverstar.codility.lessons.lesson4

import org.scalatest.{FunSpec, Matchers}

class MaxCountersSpec extends FunSpec with Matchers {

  import MaxCounters._

  val testData: Seq[((Int, Array[Int]), Array[Int])] = Seq(
    ((5, Array(3, 4, 4, 6, 1, 4, 4)), Array(3, 2, 2, 4, 2)),
    ((5, Array(3, 4, 4, 6, 1, 6, 4)), Array(3, 3, 3, 4, 3)),
    ((5, Array(1, 1, 1, 1, 1, 1, 1)), Array(7, 0, 0, 0, 0)),
    ((5, Array(6, 6, 6, 6, 6, 6, 6)), Array(0, 0, 0, 0, 0)),
    ((5, Array(1, 1, 1, 6, 6, 6, 6)), Array(3, 3, 3, 3, 3)),
    ((5, Array[Int]()), Array(0, 0, 0, 0, 0)),
    ((5, (1 to 10000).map(_ => 6).toArray), (1 to 5).map(_ => 0).toArray),
    ((10000, (1 to 10).map(_ => 10001).toArray), (1 to 10000).map(_ => 0).toArray),
    ((50000, (1 to 100000).map(_ => 50001).toArray), (1 to 50000).map(_ => 0).toArray)
  )

  describe("calculateCounters") {
    for (t <- testData) {
      it(s"should return [${t._2.mkString(";")}] for (${t._1._1}; [${t._1._2.mkString(";")}])") {
        calculateCounters(t._1._1, t._1._2) shouldBe t._2
      }
    }
  }

  describe("calculateCountersSlow") {
    for (t <- testData) {
      it(s"should return [${t._2.mkString(";")}] for (${t._1._1}; [${t._1._2.mkString(";")}])") {
        calculateCountersSlow(t._1._1, t._1._2) shouldBe t._2
      }
    }
  }
}