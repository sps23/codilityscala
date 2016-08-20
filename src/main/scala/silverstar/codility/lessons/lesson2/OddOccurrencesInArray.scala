package silverstar.codility.lessons.lesson2

object OddOccurrencesInArray {

  def oddOccurrence(a: Array[Int]): Int = {
    a.toList.groupBy(e => e).filter(p => p._2.length % 2 == 1).keys.head
  }
}
