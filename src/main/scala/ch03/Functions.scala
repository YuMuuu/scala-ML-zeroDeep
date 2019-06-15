package ch03

import breeze.linalg.DenseVector
import breeze.numerics.exp

import breeze.generic.{MappingUFunc, UFunc}

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

object relu extends UFunc with MappingUFunc {
  implicit object reluImplInt extends Impl[Int, Double] {
    def apply(x: Int) = if (x > 0) x else 0d
  }
  implicit object reluImplDouble extends Impl[Double, Double] {
    def apply(x: Double) = if (x > 0) x else 0d
  }

  implicit object reluImplFloat extends Impl[Float, Float] {
    def apply(x: Float) = if (x > 0) x else 0f
  }
}

object function {
  def ^[T](t: T) = t
}
