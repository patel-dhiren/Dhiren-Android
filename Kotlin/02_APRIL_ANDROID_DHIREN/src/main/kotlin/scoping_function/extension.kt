package scoping_function

fun main()
{
    var str = "tops"

    var result = str.concatTwoString("tech")
    println(result)
}

// Extension function
fun String.concatTwoString(other:String):String
{
    return this+other
}
