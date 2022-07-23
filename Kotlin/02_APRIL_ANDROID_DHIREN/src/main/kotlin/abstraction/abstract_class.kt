package abstraction

// abstract class
abstract class Shape{

    protected var num = 0

    fun setValue(num:Int)       // Concrete or Normal method
    {
        this.num = num
    }

    abstract fun area()     // Abstract method

}

class Circle : Shape(){

    override fun area() {
        println("area of circle : ${3.14*num*num}")
    }

}

class Square : Shape()
{
    override fun area() {
        println("area of square : ${num*num}")
    }

}

fun main()
{
    var c1 = Circle()
    c1.setValue(23)
    c1.area()

    var s1 = Square()
    s1.setValue(11)
    s1.area()
}