package collection

fun main() {

    var list = mutableListOf<Int>(23,45,67,88)

    // size
    println("size : ${list.size}")
    list.add(56)
    list.add(24)

    println("size : ${list.size}")
    var sum = 0

    list.forEach {
        sum+=it
    }

    println("sum : $sum")
    println(list)
}