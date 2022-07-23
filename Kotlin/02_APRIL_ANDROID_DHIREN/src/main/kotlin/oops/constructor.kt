package oops

class Test{

    var num1 = 0
    var num2 = 0
    var num3 = 0
    var num4 = 0

    constructor(num1:Int, num2:Int)
    {
        this.num1 = num1
        this.num2 = num2
    }

    constructor(num1:Int, num2:Int, num3:Int)
    {
        this.num1 = num1
        this.num2 = num2
        this.num3 = num3
    }

    constructor(num1:Int, num2:Int, num3:Int, num4:Int)
    {
        this.num1 = num1
        this.num2 = num2
        this.num3 = num3
        this.num4 = num4
        this.addition()
    }

    fun addition(){
        println("Addition : ${num1+num2+num3+num4}")
    }

}

fun main() {

    var t1 = Test(12,45)
    t1.addition()

    var t2 = Test(34,67,23,)
    t2.addition()
}