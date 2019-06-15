package ch03

import breeze.generic.{MappingUFunc, UFunc}
import breeze.linalg.{DenseMatrix, max, sum}
import breeze.numerics.exp

object step extends UFunc with MappingUFunc {
  implicit object stepImplInt extends Impl[Int, Double] {
    def apply(x: Int) = if (x > 0) 1d else 0d
  }
  implicit object stepImplDouble extends Impl[Double, Double] {
    def apply(x: Double) = if (x > 0d) 1d else 0d
  }

  implicit object stepImplFloat extends Impl[Float, Float] {
    def apply(x: Float) = if (x > 0f) 1f else 0f
  }
}


object function {
  def ^[T](t: T) = t

  def softMax(a: DenseMatrix[Double]): DenseMatrix[Double] = {
    val c = max(a)
    val exp_a = exp(a - c)
    val sum_exp_a = sum(exp_a)
    exp_a / sum_exp_a
  }

}
