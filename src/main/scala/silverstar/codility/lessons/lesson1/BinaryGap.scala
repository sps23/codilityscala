package silverstar.codility.lessons.lesson1

import scala.annotation.tailrec

/**
  * Solution for task: BinaryGap.
  */
object BinaryGap {

  def binaryGap(number: Int): Int = {

    @tailrec
    def iterate(chars: List[Char], binaryGap: Int, maxBinaryGap: Int): Int = chars match {
      case List() => maxBinaryGap
      case c1 :: tail if (c1 == '1') => iterate(tail, 0, Math.max(binaryGap, maxBinaryGap))
      case c1 :: tail => iterate(tail, binaryGap + 1, maxBinaryGap)
    }

    iterate(Integer.toBinaryString(number).toCharArray.toList, 0, 0)
  }

}
