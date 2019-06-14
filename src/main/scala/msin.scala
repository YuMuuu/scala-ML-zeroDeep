import java.lang.Math.pow

class msin {
  def isPrime(num : Int):  Boolean = num match {
    case 2 =>  true
    case n if n < 2 => false
    case n if n%2 == 0 =>  false
    case n => loop(n, 3)
  }

  def loop(m : Int, i: Int): Boolean = (m , i) match {
    case (m, i) if m%i == 0 => false
    case (m, i) if pow(i, 2) > m => true
    case (m, i) => loop(m, i + 2)
  }

  val result = Range(1, 3).toList.map(isPrime(_))
  println(result)
}
