package decision_making

// check whether given number is positive or negative
fun main() {
    var num = -45

    var name = "Hello, this is sample demonstration"

    var temp = name.replace(" ", "")

    println("temp : $temp")

    var result = if (num > 0) {
        println("Positive number")
        "Positive"
    } else {
        println("Negative number")
        "Negative"
    }

    println("Result : $result")

}