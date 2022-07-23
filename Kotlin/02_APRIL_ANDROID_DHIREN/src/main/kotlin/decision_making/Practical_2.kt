package decision_making
// WAP to find out largest number from given three numbers

fun main() {

    var num1 = 43
    var num2 = 45
    var num3 = 68

    var max: Int = if (num1 > num2 && num1 > num3) {
        num1
    } else if (num2 > num1 && num2 > num3) {
        num2
    } else {
        num3
    }

    println("$max is largest")

}