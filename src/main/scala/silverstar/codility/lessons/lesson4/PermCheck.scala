package silverstar.codility.lessons.lesson4

object PermCheck {

  def isPermutation(a: Array[Int]): Int = {
    val crossOut: Array[Boolean] = (1 to a.length).map(e => false).toArray

    a.foreach{ elem =>
      if(elem <= crossOut.length) crossOut.update(elem - 1, true)
    }

    if (crossOut.contains(false)) 0 else 1
  }

}
