package silverstar.codility.lessons.lesson2

/**
  * Solution for task: OddOccurrencesInArray.
  */
object OddOccurrencesInArray {

  def oddOccurrence(a: Array[Int]): Int = a.groupBy(identity).filter(_._2.length % 2 == 1).keys.headOption.getOrElse(-1)
}
