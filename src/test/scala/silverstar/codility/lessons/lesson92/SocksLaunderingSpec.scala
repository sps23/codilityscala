package silverstar.codility.lessons.lesson92

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class SocksLaunderingSpec extends AnyFunSpec with Matchers {

  import SocksLaundering._

  val testData: Seq[((Int, Array[Int], Array[Int]), Int)] = Seq(
    ((2, Array(1, 2, 1, 1), Array(1, 4, 3, 2, 4)), 3),
    ((10, Array(1, 2, 3), Array(1, 1, 2, 2, 4, 4, 6, 7, 8)), 3),
    ((10, Array(1, 2, 3), Array(4, 4, 4, 5, 5, 6, 6, 6, 7, 7)), 4),
    ((2, Array(2, 2, 1, 1), Array(1, 2, 3, 4, 5)), 2),
    ((1, Array(2, 2, 1, 1), Array(1, 2, 3, 1)), 2),
    ((2, Array(2, 2, 1, 1), Array(1, 2, 3, 1)), 3),
    ((2, Array(1, 2, 3, 4), Array(4, 3, 2, 1)), 2),
    ((2, Array(1, 1, 1, 4, 4, 4), Array(4, 3, 2, 1)), 4),
    ((2, Array(1), Array(2)), 0),
    ((2, Array[Int](), Array(1, 4, 3, 2, 4)), 1),
    ((2, Array(1, 2, 3, 3), Array[Int]()), 1),
    ((0, Array(1, 2, 1, 1), Array(1, 4, 3, 2, 4)), 1),
    ((0, Array(1, 2, 3, 4), Array(4, 3, 4, 3)), 0),
    ((2, Array[Int](), Array[Int]()), 0)
  )

  describe("maxNumberOfPairs") {
    for (t <- testData) {
      it(s"should return '${t._2}' for (k=${t._1._1}, c=[${t._1._2
        .mkString(";")}], d=[${t._1._3.mkString(";")}])") {
        maxNumberOfPairs(t._1._1, t._1._2, t._1._3) shouldBe t._2
      }
    }
  }

}
