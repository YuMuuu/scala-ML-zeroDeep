import breeze.linalg.{DenseVector, sum}

def and(x1: Int)(x2: Int): Int = {
  val bias: Double = -0.7
  val x = DenseVector[Double](x1, x2)
  val w = DenseVector[Double](0.5, 0.5)
  (sum(x *:* w) + bias) match {
    case y if y <= 0.0 => 0
    case _ => 1
  }
}

def nand(x1: Int)(x2: Int): Int = {
  val bias: Double = 0.7
  val x = DenseVector[Double](x1, x2)
  val w = DenseVector[Double](-0.5, -0.5)
  (sum(x *:* w) + bias) match {
    case y if y <= 0.0 => 0
    case _ => 1
  }
}

def or(x1: Int)(x2: Int): Int = {
  val bias: Double = -0.2
  val x = DenseVector[Double](x1, x2)
  val w = DenseVector[Double](0.5, 0.5)
  (sum(x *:* w) + bias) match {
    case y if y <= 0.0 => 0
    case _ => 1
  }
}

//TODO: 入力、出力値に型を付ける
def xor(x1: Int)(x2: Int): Int = {
  val s1 = nand(x1)(x2)
  val s2 = or(x1)(x2)
  and(s1)(s2)
}

xor(0)(0) //0
xor(0)(1) //1
xor(1)(0) //1
xor(1)(1) //0



