package silverstar.codility.lessons.lesson5

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class PassingCarsSpec extends AnyFunSpec with Matchers {

  import PassingCars._

  private val MaxN = 100000
  private val > = 0
  private val < = 1

  val testData: Seq[(Array[Int], Int)] = Seq(
    (Array(>, <, >, <, <), 5),
    (Array(>, >, >, <, <), 6),
    (Array(<, <, >, >, >), 0),
    (
      (1 to MaxN).map(_ => <).toArray[Int] ++ Array(>, <) ++ (1 to MaxN)
        .map(_ => >)
        .toArray[Int],
      1
    ),
    ((1 to MaxN).map(i => i % 2).toArray, -1)
  )

  describe("numberOfPassingCars") {
    for (t <- testData) {
      it(s"should return '${t._2}' for '${t._1.mkString}'")(
        numberOfPassingCars(t._1) shouldBe t._2
      )
    }
  }

  describe("numberOfPassingCarsSlow") {
    for (t <- testData) {
      it(s"should return '${t._2}' for '${t._1.mkString}'")(
        numberOfPassingCarsSlow(t._1) shouldBe t._2
      )
    }
  }
}
