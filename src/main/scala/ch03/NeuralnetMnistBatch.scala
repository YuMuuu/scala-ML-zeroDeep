package ch03

import breeze.linalg.DenseMatrix
import breeze.numerics.sigmoid

import ch03.function.^

case class Network(
    w1: DenseMatrix[Double],
    b1: DenseMatrix[Double],
    w2: DenseMatrix[Double],
    b2: DenseMatrix[Double],
    w3: DenseMatrix[Double],
    b3: DenseMatrix[Double],
)

class neuralnetMnistBatch {
  type y = DenseMatrix[Double]

  def forward(network: Network, x: DenseMatrix[Double]): y = {
    val a1 = x * network.w1 + network.b1
    val z1 = sigmoid(a1)
    val a2 = z1 * network.w2 + network.b2
    val z2 = sigmoid(a2)
    val a3 = z2 * network.w3 + network.b3
    ^(a3)
  }
}

object neuralnetMnistBatch {
  def apply: neuralnetMnistBatch = new neuralnetMnistBatch
  def forward(network: Network, x: DenseMatrix[Double]): DenseMatrix[Double] =
    apply.forward(network, x)
}
