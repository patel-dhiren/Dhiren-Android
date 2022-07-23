package oops.polymorphism
// Method overloading

class Shape{

    private var side:Int = 0

    fun setSide(side:Int){
        this.side = side
    }

    fun area()
    {
        println("area of Square : ${side*side}")
    }

    fun area(num:Float)
    {
        println("area of circle : ${3.14*num*num}")
    }

    fun area(length:Float, breadth:Float)
    {
        println("area of Rectangle : ${length*breadth}")
    }


}


fun main()
{
    var circle = Shape()
    circle.area(23.5f)

    var rect = Shape()
    rect.area(23.4f, 2.5f)

    var square= Shape()
    square.setSide(12)
    square.area()

}