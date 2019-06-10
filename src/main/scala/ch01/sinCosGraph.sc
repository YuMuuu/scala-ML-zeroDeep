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
val y1 = DenseVector(xs.map(sin(_)):_*)
val y2 = DenseVector(xs.map(cos(_)):_*)

p += plot(x, y1, name = "sin")
p += plot(x, y2, name = "cos")
p.xlabel = "x"
p.ylabel = "y"
p.title = "sin & cos"


f.saveas("sinCosGraph.png")