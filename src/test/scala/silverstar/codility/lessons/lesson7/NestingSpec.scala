package silverstar.codility.lessons.lesson7

import org.scalatest.{FunSpec, Matchers}

class NestingSpec extends FunSpec with Matchers {

  import Nesting._

  val MaxN = 1000000

  val testData: Seq[(String, Int)] = Seq(
    ("(()(())())", 1),
    ("())", 0),
    ("", 1),
    ((0 until MaxN).map(i => if (i % 2 == 0) '(' else ')').mkString, 1)
  )

  describe("isProperlyNested") {
    for (t <- testData) {
      it(s"should return ${t._2} for ${t._1}") {
        isProperlyNested(t._1) shouldBe t._2
      }
    }
  }
}