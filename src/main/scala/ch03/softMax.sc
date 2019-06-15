import breeze.linalg.{DenseMatrix, sum}
import ch03.function.softMax


val a = DenseMatrix((0.3, 2.9, 4.0))
val y = softMax(a)

sum(y)
