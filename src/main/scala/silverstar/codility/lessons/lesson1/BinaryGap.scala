package silverstar.codility.lessons.lesson1

import scala.annotation.tailrec

/**
  * Solution for task: BinaryGap.
  */
object BinaryGap {

  def binaryGap(number: Int): Int = {

    @tailrec
    def iterate(charArray: List[Char], binaryGap: Int, maxBinaryGap: Int): Int = charArray match {
      case Seq() => maxBinaryGap
      case c1 :: tail => {
        iterate(
          charArray = tail,
          binaryGap = if (c1 == '1') 0 else binaryGap + 1,
          maxBinaryGap = if (c1 == '1') Math.max(binaryGap, maxBinaryGap) else maxBinaryGap
        )
      }
    }

    val binary: String = Integer.toBinaryString(number)
    //println(s"binary=$binary")
    iterate(binary.toCharArray.toList, 0, 0)
  }

}
