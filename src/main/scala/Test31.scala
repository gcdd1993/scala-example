/**
  * 使用隐式转换加强现有类型
  *
  * @author gaochen
  * @date 2020/1/24
  */
object Test31 {

  class Man(val name: String)

  class SuperMan(val name: String) {
    def emitLaser(): Unit = println("emit a laster!")
  }

  implicit def man2SuperMan(man: Man): SuperMan = {
    new SuperMan(man.name)
  }

  def main(args: Array[String]): Unit = {
    val leo = new Man("leo")
    leo.emitLaser()
  }

}
