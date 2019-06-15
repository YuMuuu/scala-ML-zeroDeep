package ch03

import java.io._
import java.nio.file._

class Mnist {

  val urlBase = "http://yann.lecun.com/exdb/mnist/"
  val keyFile = new {
    val trainImg = "train-images-idx3-ubyte.gz"
    val train_label = "train-labels-idx1-ubyte.gz"
    val test_img = "t10k-images-idx3-ubyte.gz"
    val test_label = "t10k-labels-idx1-ubyte.gz"
  }

  val datasetDir: String = getClass.getResource("/").toString
  val saveFile = datasetDir + "/mnist.pkl"

  val trainNum = 60000
  val testNum = 10000

  val imgDim = ???
  val imgSize = 784

  def download() = ???

  def downloadMnist() = ???

  def loadLabel() = ???

  def loadImg() = ???

  def convertNumpy() = ???

  def initMnist() = {
    downloadMnist
    val dataset = convertNumpy
    print("Creating pickle file ...")


  }

  def changeOneHotLabel = ???

  def loadlMnist()(normalize: Boolean = true,
                   flatten: Boolean = true,
                   one_hot_label: Boolean = false) = {
//    """MNISTデータセットの読み込み
//    Parameters
//    ----------
//    normalize : 画像のピクセル値を0.0~1.0に正規化する
//    one_hot_label :
//        one_hot_labelがTrueの場合、ラベルはone-hot配列として返す
//        one-hot配列とは、たとえば[0,0,1,0,0,0,0,0,0,0]のような配列
//    flatten : 画像を一次元配列に平にするかどうか
//    Returns
//    -------
//    (訓練画像, 訓練ラベル), (テスト画像, テストラベル)
//    """

    val folder: File = new File(saveFile)

    if (!folder.exists) {
      initMnist()
    }

  }
}

object Mnist {
  def apply: Mnist = new Mnist()
  def loadMnist = apply.loadlMnist()
}
