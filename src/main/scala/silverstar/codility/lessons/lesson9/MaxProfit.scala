package silverstar.codility.lessons.lesson9

import scala.annotation.tailrec

object MaxProfit {

  def maxProfit(a: Array[Int]): Int = {

    @tailrec
    def iterate(aList: List[Int], min: Int, max: Int, maxProfit: Int): Int = aList match {
      case List() =>
        if (maxProfit > 0) maxProfit else 0
      case h :: t =>
        val (newMin, newMax): (Int, Int) = if (h < min) (h, h) else (min, Math.max(h, max))
        val newMaxProfit: Int = Math.max(newMax - newMin, maxProfit)
        iterate(t, newMin, newMax, newMaxProfit)
    }

    a.toList match {
      case h :: t => iterate(t, h, h, 0)
      case _ => 0
    }
  }
}
