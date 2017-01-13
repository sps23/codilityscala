package silverstar.codility.lessons.lesson4

import scala.annotation.tailrec

object FrogRiverOne {

  def whenFrogCanJump(x: Int, a: Array[Int]): Int = {

    @tailrec
    def iterate(i: Int, missing: Int, leaves: Set[Int]): Int = missing match {
      case 0 => i - 1
      case _ => a.length - i match {
        case 0 => -1
        case _ =>
          val leafPosition = a(i)
          if (leafPosition <= x && !leaves.contains(leafPosition)) iterate(i + 1, missing - 1, leaves + leafPosition)
          else iterate(i + 1, missing, leaves)
      }
    }

    iterate(0, x, Set())
  }
}
