package silverstar.codility.lessons.lesson4

import scala.annotation.tailrec

object MissingInteger {

  def missingIntegerIter(a: Array[Int]): Int = {

    val aSet = a.toSet
    for (i <- 1 to Integer.MAX_VALUE) {
      if (!aSet.contains(i)) return i
    }
    -1
  }

  def missingIntegerRec(a: Array[Int]): Int = {

    @tailrec
    def iterate(i: Int, set: Set[Int]): Int = {
      if (i == Integer.MAX_VALUE) if (set.contains(i)) i else -1
      else if (i < Integer.MAX_VALUE && !set.contains(i)) i
      else iterate(i + 1, set)
    }

    val aSet = a.toSet
    iterate(1, aSet)
  }
}
