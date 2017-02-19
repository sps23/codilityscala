package silverstar.codility.lessons.lesson6

import scala.annotation.tailrec

object NumberOfDiscIntersections {

  def numberOfIntersections(a: Array[Int]): Int = {

    val MAX = 10000000

    @tailrec
    def iterate(aList: List[(Int, Long)], tList: List[Long], n: Int): Int = aList match {
      case List() => n
      case h :: t =>
        val newTList = tList.collect { case tt: Long if tt >= h._1 => tt }
        val newN = n + newTList.length
        if (newN > MAX) -1
        else iterate(t, h._2 :: newTList, newN)
    }

    val intervalsSortedByStart = a.zipWithIndex.map(t => (t._2 - t._1, t._2.toLong + t._1)).sortBy(_._1)
    iterate(intervalsSortedByStart.toList, List(), 0)
  }
}