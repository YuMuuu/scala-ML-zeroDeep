import breeze.linalg.DenseMatrix
import breeze.numerics.sigmoid
import ch03.function.^

val x = DenseMatrix((1.0, 0.5))
val w1 = DenseMatrix((0.1, 0.3, 0.5), (0.2, 0.4, 0.6))
val b1 = DenseMatrix((0.1, 0.2, 0.3))

val a1 = x * w1 + b1
val z1 = sigmoid(a1)


val w2 = DenseMatrix((0.1, 0.4), (0.2, 0.5), (0.3, 0.6))
val b2 = DenseMatrix((0.1, 0.2))

val a2 = z1 * w2 + b2
val z2 = sigmoid(a2)


val w3 = DenseMatrix((0.1, 0.3), (0.2, 0.4))
val b3 = DenseMatrix((0.1, 0.2))

val a3 = z2 * w3 + b3
val y = ^(a3)