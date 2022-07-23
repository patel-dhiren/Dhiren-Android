package scoping_function

fun main() {

    //var result = greater(23,56)
    val x: Int = 6
    val y : Int = 10
    var result = x greaterNumber y

    println("Largest Number : $result")
}

// infix function
infix fun Int.greaterNumber(other:Int): Int {
    return if (this>other) this else other
}

fun greater(num1:Int, num2:Int) : Int
{
    return if (num1>num2) num1 else num2
}
