package silverstar.codility.lessons.lesson6

import scala.annotation.tailrec

object Triangle {

  def hasTriangularTriplet(a: Array[Int]): Int = {

    @tailrec
    def iterate(list: List[Int], result: Int): Int = list match {
      case h :: x :: y :: tail =>
        if(h.toLong + x.toLong > y.toLong) 1
        else iterate(x :: y :: tail, result)
      case _ => 0
    }

    iterate(a.toList.sorted, 0)
  }
}
