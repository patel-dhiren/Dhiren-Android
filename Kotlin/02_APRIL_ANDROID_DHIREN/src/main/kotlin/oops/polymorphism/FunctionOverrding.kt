package oops.polymorphism

open class A{

    open fun show()          // overridden method
    {
        println("ClassA method called")
    }

    open fun calculate(num1:Int, num2:Int)
    {
        println("addition : ${num1+num2}")
    }

}

class B : A(){

    override fun show()          // overriding method
    {
        println("ClassB method called")
    }

    override fun calculate(num1: Int, num2: Int) {
        super.calculate(num1, num2)
        println("subtraction : ${num1-num2}")
    }

}

fun main()
{

    var objA = A()
    objA.show()

    var objB = B()
    objB.show()
    objB.calculate(56, 78)

}