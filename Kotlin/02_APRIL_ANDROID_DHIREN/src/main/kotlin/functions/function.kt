package functions

fun main() {

    add()
    printTable(7)
    var res = multiply()
    println("value of res : $res")

    for (element in getLanguages("framework"))
    {
        println("$element")
    }

}


// with parameter and with return type
fun getLanguages(key:String = ""):Array<String>
{
    return when (key) {
        "language" -> arrayOf("Dart", "Python", "Java", "C++", "Kotlin")
        "framework" -> arrayOf("Angular", "Flutter", "React", "Laravel")
        else -> emptyArray()
    }
}

// without parameter and with returntype
fun multiply(): Int {
    return 34 * 4
}

// with parameters and without return type
fun printTable(num: Int) {
    for (i in 1..10)
        println(i * num)
}


// without return type and without argument
fun add() {

    var num1 = 45
    var num2 = 56

    println("addition : ${num1 + num2}")

}