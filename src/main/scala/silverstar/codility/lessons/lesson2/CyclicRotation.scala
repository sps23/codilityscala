package silverstar.codility.lessons.lesson2

import scala.annotation.tailrec

/**
  * Solution for task: CyclicRotation.
  */
object CyclicRotation {


  def rotate(a: Array[Int], k: Int): Array[Int] = {

    @tailrec
    def singleRotate(array: Array[Int], numberOfRotations: Int): Array[Int] = numberOfRotations match {
      case 0 => array
      case n: Int => singleRotate(array.last +: array.init, n - 1)
    }

    a match {
      case Array() => Array()
      case array => singleRotate(array, k % array.length)
    }
  }
}
