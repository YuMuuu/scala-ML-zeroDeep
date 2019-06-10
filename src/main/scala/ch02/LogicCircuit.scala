

class LogicCircuit {
  def and(x1: Int)(x2: Int): Int = x1 & x2
  def nand(x1: Int)(x2: Int):Int = {
    if (and(x1)(x2) == 1) 0
     else 1
  }
  def or(x1: Int)(x2: Int): Int = x1 | x2
  def xor(x1: Int)(x2: Int): Int = x1 ^ x2


}


object LogicCircuit {
  def apply: LogicCircuit = new LogicCircuit

  def and(x1: Int)(x2: Int) = apply.and(x1)(x2)
  def nand(x1: Int)(x2: Int) = apply.nand(x1)(x2)
  def or(x1: Int)(x2: Int) = apply.or(x1)(x2)
  def xor(x1: Int)(x2: Int) = apply.xor(x1)(x2)
}