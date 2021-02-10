package silverstar.codility.lessons.lesson7

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class StoneWallSpec extends AnyFunSpec with Matchers {

  import StoneWall._

  val MaxN = 10000
  val MaxA = 100000000

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(8, 8, 5, 7, 9, 8, 7, 4, 8), 7),
    (Array(2, 3, 2, 1), 3),
    (Array(7, 5, 4, 2), 4),
    (Array(2, 4, 2, 3, 1, 2), 5),
    (Array(1), 1),
    ((1 to MaxN).map(_ => MaxA).toArray, 1),
    ((1 to MaxN).toArray, MaxN),
    ((1 to MaxN).reverse.toArray, MaxN)
  )

  describe("numberOfBlocksInWall") {
    for (t <- testData) {
      it(s"should return ${t._2} for [${t._1.take(10).mkString(";")}]") {
        numberOfBlocksInWall(t._1) shouldBe t._2
      }
    }
  }

  describe("numberOfBlocksInWallIter") {
    for (t <- testData) {
      it(s"should return ${t._2} for [${t._1.take(10).mkString(";")}]") {
        numberOfBlocksInWallIter(t._1) shouldBe t._2
      }
    }
  }
}
