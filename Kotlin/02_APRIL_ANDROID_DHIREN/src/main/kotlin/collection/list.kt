package collection

fun main() {

    // immutable list
    var colorList = listOf<String>("red","black", "blue", "white", "black")

    // size
    println("size of list : ${colorList.size}")

    // get element on index based
    for(index in colorList.indices)
    {
        println(colorList[index])
    }

    // read element using for-each
    colorList.forEach {
        println("$it")
    }

    val numList = listOf<Int>(23,45,67,89,0,56,34)

    var sum = 0

    numList.forEach {
        sum+=it
    }

    println("$sum")

}