package silverstar.codility.lessons.lesson92

import scala.annotation.tailrec

object SocksLaundering {

  def maxNumberOfPairs(k: Int, c: Array[Int], d: Array[Int]): Int = {

    @tailrec
    def pairClean(clean: List[Int],
                  cleanUnpaired: List[Int],
                  cleanPairs: Int): (Int, List[Int]) = clean match {
      case List() => (cleanPairs, cleanUnpaired)
      case h :: t =>
        if (cleanUnpaired.contains(h)) pairClean(t, cleanUnpaired.diff(List(h)), cleanPairs + 1)
        else pairClean(t, cleanUnpaired :+ h, cleanPairs)
    }

    @tailrec
    def pairCleanWithDirty(cleanUnpaired: List[Int],
                           dirty: List[Int],
                           spaceLeft: Int,
                           cleanPairs: Int): (Int, Int, List[Int]) = cleanUnpaired match {
      case List() => (spaceLeft, cleanPairs, dirty)
      case h :: t =>
        if (spaceLeft > 0) {
          if (dirty.contains(h)) pairCleanWithDirty(t, dirty.diff(List(h)), spaceLeft - 1, cleanPairs + 1)
          else pairCleanWithDirty(t, dirty, spaceLeft, cleanPairs)
        } else (spaceLeft, cleanPairs, dirty)
    }

    @tailrec
    def pairDirty(dirty: List[Int],
                  dirtyUnpaired: List[Int],
                  spaceLeft: Int,
                  cleanPairs: Int): Int = dirty match {
      case List() => cleanPairs
      case h :: t =>
        if (spaceLeft > 1) {
          if (dirtyUnpaired.contains(h)) pairDirty(t, dirtyUnpaired.diff(List(h)), spaceLeft - 2, cleanPairs + 1)
          else pairDirty(t, dirtyUnpaired :+ h, spaceLeft, cleanPairs)
        } else cleanPairs
    }

    val (cleanPairs1, cleanUnpaired) = pairClean(c.toList, List(), 0)
    val (spaceLeft, cleanPairs2, dirtyLeft) = pairCleanWithDirty(cleanUnpaired, d.toList, k, cleanPairs1)
    pairDirty(dirtyLeft, List(), spaceLeft, cleanPairs2)
  }
}
