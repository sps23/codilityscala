package silverstar.codility.lessons.lesson4

import scala.annotation.tailrec

@SuppressWarnings(Array("org.wartremover.warts.NonUnitStatements"))
object MaxCounters {

  def calculateCountersSlow(n: Int, a: Array[Int]): Array[Int] = {

    @tailrec
    def iterate(max: Int, i: Int, counters: Array[Int]): Array[Int] = {
      if (i < a.length) {
        val newMax: Int = if (a(i) >= 1 && a(i) <= n) {
          counters(a(i) - 1) = counters(a(i) - 1) + 1
          Math.max(counters(a(i) - 1), max)
        } else {
          counters.mapInPlace(_ => max)
          max
        }
        iterate(newMax, i + 1, counters)
      } else counters
    }

    iterate(0, 0, Array.ofDim[Int](n))
  }

  def calculateCounters(n: Int, a: Array[Int]): Array[Int] = {

    @tailrec
    def iterate(max: Int, toAdd: Int, i: Int, counters: Array[Int]): Array[Int] = {
      if (i < a.length) {
        val index = a(i) - 1
        val (newMax, newToAdd) =
          if (a(i) >= 1 && a(i) <= n) {
            counters(index) = Math.max(counters(index), toAdd) + 1
            (Math.max(counters(index), max), toAdd)
          } else (max, max)
        iterate(newMax, newToAdd, i + 1, counters)
      } else counters.map(e => Math.max(e, toAdd))
    }

    iterate(0, 0, 0, Array.ofDim[Int](n))
  }
}
