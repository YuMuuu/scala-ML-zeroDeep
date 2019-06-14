//import breeze.linalg._
//import breeze.stats.distributions.Beta
//
//import breeze.plot._
//
//val f = Figure()
//val p = f.subplot(0)
//
//
//val x = DenseVector.zeros[Double](60)
//println(x)
//
//val y = Range(0, 10, 3).toVector.map(_*0.1)
////val _y = y.map(_*0.1)
//
//
//
//x(0 to 60) := y

import Math._
import scalaz.Memo

@scala.annotation.tailrec
def loop(m: Int)(i: Int): Boolean = (m, i) match {
  case (m, i) if m%i == 0 => false
  case (m, i) if pow(i, 2) > m =>  true
  case (m, i) => loop(m)(i + 2)
}

val isPrime: Int => Boolean =  Memo.mutableHashMapMemo {
  case 2 => true
  case n if n < 2 => false
  case n if n % 2 == 0 => false
  case n => loop(n)(3)
}

val result: Boolean = isPrime(999999999)
println(result)

