package silverstar.codility.lessons.lesson6

object MaxProductOfThree {

  def maxProductTriplet(a: Array[Int]): Int = {

    val (aNegativeAsc, aPositiveAsc) = a.sorted.partition(_ < 0)
    val aPositiveDesc = aPositiveAsc.reverse
    val aNegativeDesc = aNegativeAsc.reverse

    val productWithAllPositive: Option[Int] =
      if (aPositiveDesc.length > 2)
        Option(aPositiveDesc.head * aPositiveDesc.tail.head * aPositiveDesc.tail.tail.head)
      else None

    val productWith2Negative: Option[Int] =
      if (aNegativeAsc.length > 1 && !aPositiveDesc.isEmpty)
        Option(aNegativeAsc.head * aNegativeAsc.tail.head * aPositiveDesc.head)
      else None

    (productWithAllPositive, productWith2Negative) match {
      case (Some(i), Some(j)) => Math.max(i, j)
      case (Some(i), None) => i
      case (None, Some(j)) => j
      case _ =>
        val productWithAllNegative =
          if (aNegativeDesc.length > 2)
            Option(aNegativeDesc.head * aNegativeDesc.tail.head * aNegativeDesc.tail.tail.head)
          else None
        val productWith1Negative =
          if (aPositiveAsc.length > 1 && !aNegativeDesc.isEmpty)
            Option(aPositiveAsc.head * aPositiveAsc.tail.head * aNegativeDesc.head)
          else None
        (productWithAllNegative, productWith1Negative) match {
          case (Some(i), Some(j)) => Math.max(i, j)
          case (Some(i), None) => i
          case (None, Some(j)) => j
          case _ => 1 // should never happen
        }
    }
  }
}
