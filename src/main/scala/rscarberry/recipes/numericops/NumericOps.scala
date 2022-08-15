package rscarberry.recipes.numericops

object NumericOps {

  def ~=(x: Double, y: Double, tolerance: Double): Boolean = (x - y).abs <= tolerance

}
