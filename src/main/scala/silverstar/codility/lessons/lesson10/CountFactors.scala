package silverstar.codility.lessons.lesson10

import scala.annotation.tailrec

object CountFactors {

  def numberOfFactorsSlow(n: Int): Int = factorsSlow(n).length

  def factorsSlow(n: Int): Seq[Int] = (1 to n).reverse.collect { case i if n % i == 0 => n / i }

  def numberOfFactors(n: Int): Int = factors(n).length

  def factors(n: Int): Seq[Int] = {

    @tailrec
    def iterate(i: Int, f: Seq[Int]): Seq[Int] = {
      if (i.toLong * i.toLong < n.toLong)
        if (n % i == 0) iterate(i + 1, i +: (n / i) +: f)
        else iterate(i + 1, f)
      else if (i.toLong * i.toLong == n) i +: f
      else f
    }

    iterate(1, Seq())
  }
}
