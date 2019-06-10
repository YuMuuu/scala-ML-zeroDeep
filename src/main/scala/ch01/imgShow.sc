import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.File

import breeze.plot._
import javax.imageio.ImageIO

//FIXME: 表示できない

val f = Figure()

//TODO: 絶対pathに変えて実行する
val lena: BufferedImage =
  ImageIO.read(
    new File("./dataset/lena.png"))

val g2dLena: Graphics2D = lena.createGraphics


f.drawPlots(g2dLena)
f.saveas("imgShow.png")