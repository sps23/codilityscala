package silverstar.codility.lessons.lesson3

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class FrogJmpSpec extends AnyFunSpec with Matchers {

  describe("FrogJmp numberOfJumps") {

    it("returns 3 for start = 10; end = 85; jumpDistance = 30") {
      FrogJmp.numberOfJumps(10, 85, 30) shouldBe 3
    }

    it("returns 0 for start = 10; end = 10; jumpDistance = 10") {
      FrogJmp.numberOfJumps(10, 10, 10) shouldBe 0
    }

    it("returns 1 for start = 10; end = 10; jumpDistance = 10") {
      FrogJmp.numberOfJumps(10, 20, 10) shouldBe 1
    }

    it(
      "returns 1,000,000,000 for start = 0; end = 1,000,000,000; jumpDistance = 1"
    ) {
      FrogJmp.numberOfJumps(1, 1000000001, 1) shouldBe 1000000000
    }

    it(
      "returns 1,000 for start = 0; end = 1,000,000,000; jumpDistance = 1,000,000"
    ) {
      FrogJmp.numberOfJumps(1, 1000000000, 1000000) shouldBe 1000
    }
  }
}
