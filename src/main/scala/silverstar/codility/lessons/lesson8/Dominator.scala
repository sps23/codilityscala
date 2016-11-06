package silverstar.codility.lessons.lesson8

import scala.annotation.tailrec

object Dominator {

  def dominator(a: Array[Int]): Int = {

    @tailrec
    def iterate(index: Int, occurrences: Map[Int, Array[Int]]): Map[Int, Array[Int]] = {
      if (index < a.length) {
        val aVal = a(index)
        iterate(index + 1, occurrences + occurrences.get(aVal).fold(
          aVal -> Array(index))(aa => aVal -> (aa :+ index)))
      } else occurrences
    }

    def aMapped: Map[Int, (Int, Int)] = a.zipWithIndex.foldLeft(Map[Int, (Int, Int)]())((occurrences, tuple) => {
      val (value, index) = tuple
      occurrences + occurrences.get(value).fold(value -> (index, 1))(aa => value -> (aa._1, aa._2 + 1))
    })

    // iterate(0, Map.empty).filter(_._2.length > a.length / 2).map(_._2.head).headOption.getOrElse(-1)
    aMapped.filter(_._2._2 > a.length / 2).map(_._2._1).headOption.getOrElse(-1)
  }
}