package oops.inheritance
// Single Inheritance
open class A{

    var a = 23

    fun showA()
    {
        println("value of a : $a")
    }

}

open class B : A(){      // B inherits A

    var b = 56

    fun showB()
    {
        println("value of b : $b")
    }

}

class C : A()
{
    var c = 78

    fun showC()
    {
        println("value of c : $c")
    }
}


fun main() {

    //var objA = A()
    var objB = B()
    objB.showA()        // parent class method called
    objB.showB()        // child class method called

    println("*******************************")

    var objC = C()
    objC.showA()
    //objC.showB()
    objC.showC()

}