package silverstar.codility.lessons.lesson5

import scala.annotation.tailrec

object PassingCars {

  private val max = 1000000000

  def numberOfPassingCars(a: Array[Int]): Int = {

    a.iterator
      .scanLeft((0, 0)) {
        case ((_, nPassing), _) if nPassing > max => (0, -1)
        case ((nEast, nPassing), 0)               => (nEast + 1, nPassing)
        case ((nEast, nPassing), _)               => (nEast, nPassing + nEast)
      }
      .takeWhile(_._2 > -1)
      .map(_._2)
      .foldLeft(0)((_, b) => b)
  }

  def numberOfPassingCarsSlow(a: Array[Int]): Int = {

    @tailrec
    def iterate(list: List[Int], nEast: Int, nPassing: Int): Int = list match {
      case List() => nPassing
      case head :: tail =>
        head match {
          case _ if nPassing > max => -1
          case 0                   => iterate(tail, nEast + 1, nPassing)
          case 1                   => iterate(tail, nEast, nPassing + nEast)
          case _                   => -1
        }
    }

    iterate(a.toList, 0, 0)
  }
}
