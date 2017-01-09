package silverstar.codility.lessons.lesson7

import scala.annotation.tailrec

object Fish {

  def numberOfFishAlive(a: Array[Int], b: Array[Int]): Int = {

    def findSurvivor(fish1: (Int, Int), fish2: (Int, Int)): (Int, Int) = if (fish1._1 > fish2._1) fish1 else fish2

    def isUpstream(i: Int): Boolean = i == 1

    @tailrec
    def iterate(fish: List[(Int, Int)], upstreamFish: List[(Int, Int)], survivors: Int): Int = fish match {
      case List() => survivors
      case f :: fs =>
        if (isUpstream(f._2)) iterate(fs, f :: upstreamFish, survivors)
        else upstreamFish match {
          case List() => iterate(fs, upstreamFish, survivors)
          case u :: us => iterate(findSurvivor(f, u) :: fs, us, survivors - 1)
        }
    }

    iterate(a.zip(b).toList, List(), a.length)
  }
}
