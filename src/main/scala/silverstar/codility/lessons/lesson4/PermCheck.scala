package silverstar.codility.lessons.lesson4

object PermCheck {

  def isPermutation(a: Array[Int]): Int = if ((1 to a.length).sum == a.sum) 1 else 0

}
