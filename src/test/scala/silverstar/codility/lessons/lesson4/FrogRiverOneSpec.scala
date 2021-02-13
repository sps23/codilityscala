package silverstar.codility.lessons.lesson4

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FrogRiverOneSpec extends AnyFunSpec with Matchers {

  import FrogRiverOne._

  private val MaxN = 100000
  private val MinN = 1
  private val MaxX = MaxN
  private val MinX = MinN

  val testData: Seq[((Int, Array[Int]), Int)] = Seq(
    ((5, Array(1, 3, 1, 4, 2, 3, 5, 4)), 6),
    ((5, Array(1, 3, 1, 4, 2, 3, 2, 4)), -1),
    ((MinX, (MinN to MaxN).toArray), MinX - 1),
    ((MaxX, (MinN to MaxN).toArray), MaxX - 1),
    ((MinX, (MinN to MaxN).reverse.toArray), MaxX - 1)
  )

  describe("whenFrogCanJump") {
    for (t <- testData) {
      it(s"should return ${t._2.toString} for (${t._1._1.toString}; [${t._1._2.take(10).mkString(";")}])") {
        whenFrogCanJump(t._1._1, t._1._2) shouldBe t._2
      }
    }
  }
}
