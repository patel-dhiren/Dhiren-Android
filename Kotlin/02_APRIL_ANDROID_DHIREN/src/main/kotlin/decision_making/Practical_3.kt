package decision_making
// WAP to find out largest number from given three numbers using nested if

fun main() {
    var num1 = 23
    var num2 = 56
    var num3 = 78
    // Nested if
    var max = if (num1 > num2) {

        if (num1 > num3) {
            num1
        } else {
            num3
        }

    } else {

        if (num2 > num3) {
            num2
        } else {
            num3
        }

    }

    println("$max is largest")

}