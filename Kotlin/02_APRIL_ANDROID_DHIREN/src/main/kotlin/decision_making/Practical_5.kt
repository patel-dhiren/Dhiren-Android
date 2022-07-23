package decision_making

fun main()
{

    var num = 3

    when(num)
    {
        1,3,5,7,9 ->{
            println("Odd numbers")
        }
        2,4,6,8,10 ->{
            println("Even number")
        }
        else -> println("invalid input")
    }

}