package silverstar.codility.lessons.lesson7

import scala.annotation.tailrec

object Brackets {

  def isProperlyNested(s: String): Int = {

    def isLeftBracket(c: Char): Boolean = c == '{' || c == '[' || c == '('

    def isRightBracket(c: Char): Boolean = c == '}' || c == ']' || c == ')'

    def bracketsMatch(cLeft: Char, cRight: Char): Boolean = (cLeft, cRight) match {
      case ('{', '}') => true
      case ('[', ']') => true
      case ('(', ')') => true
      case _ => false
    }

    @tailrec
    def iterate(chars: List[Char], leftBrackets: List[Char]): Int = chars match {
      case List() => if(leftBrackets.isEmpty) 1 else 0
      case c :: cs =>
        if (isLeftBracket(c)) iterate(cs, c :: leftBrackets)
        else if (isRightBracket(c)) leftBrackets match {
          case List() => 0
          case l :: ls => if (bracketsMatch(l, c)) iterate(cs, ls) else 0
        }
        else 0
    }

    iterate(s.toCharArray.toList, List())
  }
}
