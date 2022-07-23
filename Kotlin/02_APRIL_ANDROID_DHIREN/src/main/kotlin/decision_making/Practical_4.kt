package decision_making

fun main()
{

    var num1 = 45
    var num2 = 4

    var msg = """
        1) Addition
        2) Multiplication
        3) Division
        4) Subtraction
    """.trimIndent()

    println(msg)
    print("Enter choice : ")

    var choice = readLine()!!.toInt()

    var result = when(choice)
    {
        1 ->{
            println("Addition : ${num1+num2}")
        }
        2 -> println("Multiplication : ${num1*num2}")
        3 -> println("Division : ${num1/num2.toFloat()}")
        4 -> println("Subtraction : ${num1-num2}")
        else -> println("invalid input")
    }

}