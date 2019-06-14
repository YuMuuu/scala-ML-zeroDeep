import breeze.linalg._
import breeze.plot._
import ch03.Functions._

val f = Figure()
val p = f.subplot(0)

val xs  = {
  (BigDecimal(-5.0) to 5.0 by 0.1)
    .map(_.doubleValue)
}

val x = DenseVector(xs:_*)
val y1 = sigmoid(x)
val y2 = step(x)


p += plot(x, y1)
p += plot(x, y2)

f.saveas("sinGraph.png")