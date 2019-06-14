package ch03

import breeze.linalg.DenseVector
import breeze.numerics.exp

class Functions {
  /*unused
  *
  * import breeze.numerics.sigmoid
  */
  def sigmoid(x: DenseVector[Double]): DenseVector[Double] = {
    x.map{
      it => 1.0/(1.0 + exp(-it))
    }
  }

  def step(x: DenseVector[Double]): DenseVector[Double] =
    x.map{
      it => if(it > 0) 1.0 else 0.0
    }

  def relu(x: DenseVector[Double]): DenseVector[Double] =
    x.map{
      it => if(it > 0) it else 0.0
    }
}

object Functions {
  def apply: Functions = new Functions

  def sigmoid(x: DenseVector[Double]) = apply.sigmoid(x)
  def step(x: DenseVector[Double]) = apply.step(x)
  def relu(x: DenseVector[Double]): DenseVector[Double] = apply.relu(x)
}