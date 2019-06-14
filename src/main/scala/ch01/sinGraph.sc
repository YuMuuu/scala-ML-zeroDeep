import breeze.linalg._
import breeze.plot._
import Math._


val f = Figure()
val p = f.subplot(0)

//TODO:ダサい x sizeではない
val xs  = {
  (BigDecimal(0) to 6 by 0.1)
    .map(_.doubleValue)
}

val x = DenseVector(xs:_*)
val y = DenseVector(xs.map(sin(_)):_*)

p += plot(x, y)

f.saveas("sinGraph.png")