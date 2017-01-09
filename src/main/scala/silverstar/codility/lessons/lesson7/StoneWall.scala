package silverstar.codility.lessons.lesson7

import scala.annotation.tailrec
import scala.collection.mutable

object StoneWall {

  def numberOfBlocksInWall(h: Array[Int]): Int = {

    @tailrec
    def iterate(wall: List[Int], mins: List[Int], nBlocks: Int): Int = wall match {
      case List() => nBlocks
      case head :: tail =>
        val newMins: List[Int] = mins.dropWhile(head < _)
        if (newMins.nonEmpty && head == newMins.head) iterate(tail, newMins, nBlocks)
        else iterate(tail, head :: newMins, nBlocks + 1)
    }

    iterate(h.toList, List(), 0)
  }

  def numberOfBlocksInWallIter(h: Array[Int]): Int = {

    var counter: Int = 0
    val stack = new mutable.Stack[Int]()

    for (i <- h.indices) {
      while (stack.nonEmpty && h(i) < stack.head) stack.pop
      if (stack.nonEmpty && h(i) == stack.head) {}
      else {
        stack.push(h(i))
        counter += 1
      }
    }
    counter
  }
}
