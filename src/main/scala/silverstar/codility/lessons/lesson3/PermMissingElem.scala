package silverstar.codility.lessons.lesson3

object PermMissingElem {

  def missingElem(a: Array[Int]): Int = (1 to a.length + 1).sum - a.sum

}
