package designPatterns

object extensionDesignPatternClasses {

  class DoSomething {
    def doSomething(): Unit = {
      print("Function that does something.\n")
    }
  }

  implicit class ExtendDoSomething(v: DoSomething) {
    def doAnotherThing(): Unit = {
      print("Function that does another thing.\n")
    }
  }
}

object extensionDesignPattern extends App {
  val doSomethingObject = new extensionDesignPatternClasses.DoSomething()
  doSomethingObject.doSomething()
  doSomethingObject.doAnotherThing()
}
