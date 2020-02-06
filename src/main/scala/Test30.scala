/**
  * 隐式转换函数
  *
  * @author gaochen
  * @date 2020/1/24
  */
object Test30 {

  class SpecialPerson(val name: String)

  class Student(val name: String)

  class Older(val name: String)

  implicit def object2SpecialPerson(obj: Object): SpecialPerson = {
    obj match {
      case p: Student => new SpecialPerson(p.name)
      case p: Older => new SpecialPerson(p.name)
      case _ => null
    }
  }

  var ticketNumber = 0

  def buySpecialTicket(p: SpecialPerson): String = {
    ticketNumber += 1
    "T-" + ticketNumber
  }

  def main(args: Array[String]): Unit = {
    val s = new Student("学生1")
    val o = new Older("老人1")

    println(buySpecialTicket(s))
    println(buySpecialTicket(o))

    println("ticket number " + ticketNumber)
  }

}
