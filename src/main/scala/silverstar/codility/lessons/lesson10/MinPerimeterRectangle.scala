package silverstar.codility.lessons.lesson10

import scala.annotation.tailrec
import scala.language.postfixOps

object MinPerimeterRectangle {

  def perimeter(a: Int, b: Int): Int = 2 * (a + b)

  def minPerimeter(n: Int): Int = {

    @tailrec
    def iterate(i: Int, min: Int): Int = {
      if (i.toLong * i.toLong < n.toLong)
        if (n % i == 0) iterate(i + 1, Math.min(min, perimeter(i, n / i)))
        else iterate(i + 1, min)
      else if (i.toLong * i.toLong == n) Math.min(min, perimeter(i, i))
      else min
    }

    iterate(1, Int.MaxValue)
  }

  def minPerimeterSlow(n: Int): Int = {

    @tailrec
    def allSides(i: Int, f: Seq[(Int, Int)]): Seq[(Int, Int)] = {
      if (i.toLong * i.toLong < n.toLong)
        if (n % i == 0) allSides(i + 1, (i, n / i) +: f)
        else allSides(i + 1, f)
      else if (i.toLong * i.toLong == n) (i, i) +: f
      else f
    }

    val s: Seq[(Int, Int)] = allSides(1, Seq())
    s.headOption.fold(-1)(perimeter _ tupled)
  }

  def minPerimeterFold(n: Int): Int = {

    (1 to Math.sqrt(n).toInt).fold(Int.MaxValue)((min, i) => {
      if (i.toLong * i.toLong < n.toLong)
        if (n % i == 0) Math.min(min, perimeter(i, n / i))
        else min
      else if (i.toLong * i.toLong == n) Math.min(min, perimeter(i, i))
      else min
    })
  }
}
