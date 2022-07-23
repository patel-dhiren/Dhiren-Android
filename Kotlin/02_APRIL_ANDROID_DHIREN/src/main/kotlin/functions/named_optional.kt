package functions

fun main()
{

    printCountry(num = 132, c3 = "Russia", c1 = "India", c2 = "China")

}

// Default Named Parameter
fun printCountry(c1:String, c2:String, c3:String, num:Int = 0){
    println("c1 : $c1")
    println("c2 : $c2")
    println("c3 : $c3")
    println("num : $num")

}