package silverstar.codility.lessons.lesson3

object TapeEquilibrium {

  def minimalDifference(a: Array[Int]): Int = {
    val sumFromLeft  = a.scanLeft(0)(_ + _).tail
    val sumFromRight = a.scanRight(0)(_ + _).init

    val splitPointDifference: Array[Int] =
      sumFromLeft.init.lazyZip(sumFromRight.tail).map((sL, sR) => Math.abs(sL - sR))
    splitPointDifference.min
  }
}
