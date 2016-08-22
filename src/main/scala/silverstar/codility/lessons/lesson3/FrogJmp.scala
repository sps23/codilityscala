package silverstar.codility.lessons.lesson3

object FrogJmp {

  def numberOfJumps(start: Int, end: Int, jumpDistance: Int): Int = {
    val distance = end - start
    if(distance % jumpDistance > 0) distance / jumpDistance + 1 else distance / jumpDistance
  }
}
