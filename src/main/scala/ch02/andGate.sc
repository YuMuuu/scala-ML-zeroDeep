import breeze.linalg.{DenseVector, sum}

//TODO: 入力、出力値に型を付ける
def and(x1: Int)(x2: Int): Int = {
//  TODO:implicitparameterにする
  val bias: Double = -0.7
  val x = DenseVector[Double](x1, x2)
  val w = DenseVector[Double](0.5, 0.5)
//  TODO:ダサい
  (sum(x *:* w) + bias) match {
    case y if y <= 0.0 => 0
    case _ => 1
  }
}

and(0)(0) //0
and(0)(1) //0
and(1)(0) //0
and(1)(1) //1
