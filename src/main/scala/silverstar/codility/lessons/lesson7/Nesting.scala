package silverstar.codility.lessons.lesson7

import scala.annotation.tailrec

object Nesting {

  def isProperlyNested(s: String): Int = {

    @tailrec
    def iterate(chars: List[Char], leftBrackets: List[Char]): Int = chars match {
      case List() => if (leftBrackets.isEmpty) 1 else 0
      case c :: cs =>
        if (c == '(') iterate(cs, c :: leftBrackets)
        else if (c == ')') leftBrackets match {
          case List() => 0
          case l :: ls => if (l == '(' && c == ')') iterate(cs, ls) else 0
        }
        else 0
    }

    iterate(s.toCharArray.toList, List())
  }
}
