package silverstar.codility.lessons.lesson5

object CountDiv {

  def numberOfDiv(a: Int, b: Int, k: Int): Int = (b / k) - (a / k) + {
    if (a % k == 0) 1 else 0
  }

  def numberOfDivSeq(a: Int, b: Int, k: Int): Int =
    (a to b).foldLeft(0)((nOfDiv, number) => if (number % k == 0) nOfDiv + 1 else nOfDiv)

  def numberOfDivPar(a: Int, b: Int, k: Int): Int =
    (a to b).par.aggregate(0)((nOfDiv, number) => if (number % k == 0) nOfDiv + 1 else nOfDiv, _ + _)
}
