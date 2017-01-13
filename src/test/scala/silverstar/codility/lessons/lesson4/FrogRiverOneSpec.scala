package silverstar.codility.lessons.lesson4


import org.scalatest.{FunSpec, Matchers}

class FrogRiverOneSpec extends FunSpec with Matchers {

  import FrogRiverOne._

  val MaxN = 100000
  val MinN = 1
  val MaxX = MaxN
  val MinX = MinN

  val testData: Seq[((Int, Array[Int]), Int)] = Seq(
    ((5, Array(1, 3, 1, 4, 2, 3, 5, 4)), 6),
    ((5, Array(1, 3, 1, 4, 2, 3, 2, 4)), -1),
    ((MinX, (MinN to MaxN).toArray), MinX - 1),
    ((MaxX, (MinN to MaxN).toArray), MaxX - 1),
    ((MinX, (MinN to MaxN).reverse.toArray), MaxX - 1)
  )

  describe("whenFrogCanJump") {
    for (t <- testData) {
      it(s"should return ${t._2} for (${t._1._1}; [${t._1._2.mkString(";")}])") {
        whenFrogCanJump(t._1._1, t._1._2) shouldBe t._2
      }
    }
  }
}
