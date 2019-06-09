
//TODO: 入力、出力値に型を付ける
def and(x1: Int)(x2: Int): Int = {
//  TODO:implicitparameterにする
  val w1 = 0.5
  val w2 = 0.5
  val theta = 0.7
  (x1*w1 + x2*w2) match {
    case tmp  if tmp <= theta => 0
    case _ => 1
  }
}

and(0)(0) //0
and(0)(1) //0
and(1)(0) //0
and(1)(1) //1
