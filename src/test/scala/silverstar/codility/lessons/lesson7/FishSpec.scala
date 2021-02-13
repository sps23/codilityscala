package silverstar.codility.lessons.lesson7

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FishSpec extends AnyFunSpec with Matchers {

  import Fish._

  val MaxN = 10000
  val MaxA = 100000000

  val testData: Seq[((Array[Int], Array[Int]), Int)] = Seq(
    ((Array(4, 3, 2, 1, 5), Array(0, 1, 0, 0, 0)), 2),
    ((Array(3, 2, 4, 1, 5), Array(1, 1, 1, 0, 0)), 1),
    ((Array(2, 2, 2, 2, 2), Array(0, 0, 0, 1, 1)), 5)
  )

  describe("numberOfFishAlive") {
    for (t <- testData) {
      it(
        s"should return ${t._2.toString} for {(${t._1._1.mkString(";")}) (${t._1._2.mkString(";")})}"
      ) {
        numberOfFishAlive(t._1._1, t._1._2) shouldBe t._2
      }
    }
  }
}
