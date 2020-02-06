/**
  * 隐式参数
  *
  * @author gaochen
  * @date 2020/1/24
  */
object Test32 {

  class SignPen {
    def write(content: String): Unit = println(content)
  }

  implicit val signPen = new SignPen

  def signForExam(name: String)(implicit signPen: SignPen): Unit = {
    signPen.write(name)
  }

  def main(args: Array[String]): Unit = {
    signForExam("leo")
  }

}
