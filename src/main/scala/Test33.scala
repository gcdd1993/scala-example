import Test33.HelloActor
import akka.actor.{Actor, ActorSystem}

/**
  * TODO
  *
  * @author gaochen
  * @date 2020/1/24
  */
object Test33 {

  class HelloActor extends Actor {
    override def receive: Receive = {
      case name: String => println("Hello, " + name)
    }
  }

  def main(args: Array[String]): Unit = {
    val helloActor = ActorSystem
    helloActor.sender() ! "leo"
  }

}
