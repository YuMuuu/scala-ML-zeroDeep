import breeze.linalg.{DenseMatrix, DenseVector}
import breeze.plot.{Figure, plot}
import ch03.Network
import ch03.neuralnetMnistBatch.forward


val f = Figure()
val p = f.subplot(0)


val network:Network = Network(
  DenseMatrix((0.1, 0.3, 0.5), (0.2, 0.4, 0.6)),
  DenseMatrix((0.1, 0.2, 0.3)),
  DenseMatrix((0.1, 0.4), (0.2, 0.5), (0.3, 0.6)),
  DenseMatrix((0.1, 0.2)),
  DenseMatrix((0.1, 0.3),(0.2, 0.4)),
  DenseMatrix((0.1, 0.2))
)

val x = DenseMatrix((1.0, 0.5))
val y = forward(network, x)
