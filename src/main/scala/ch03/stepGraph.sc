import breeze.linalg._
import breeze.plot._
import ch03.step

//consoleにコピペすると動く
val f = Figure()
val p = f.subplot(0)

val xs  = {
  (BigDecimal(-5.0) to 5.0 by 0.1)
    .map(_.doubleValue)
}

val x = DenseVector(xs:_*)
val y = step(x)

p += plot(x, y)

f.saveas("sinGraph.png")