import breeze.linalg._


// 2 layer NN
val x = DenseMatrix((1, 2))

(x.rows, x.cols)

val w = DenseMatrix((1, 3, 5), (2, 4, 6))



(w.rows, w.cols)

val y = x * w