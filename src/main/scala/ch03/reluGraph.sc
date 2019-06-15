import breeze.linalg._
import breeze.numerics.relu
import breeze.plot._
val f = Figure()
val p = f.subplot(0)

val xs  = {
  (BigDecimal(-5.0) to 5.0 by 0.1)
    .map(_.doubleValue)
}

val x = DenseVector(xs:_*)
val y: DenseVector[Double] = relu(x)


p += plot(x, y)

f.saveas("relu.png")