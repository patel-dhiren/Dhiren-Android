package loop

fun main()
{
    var sum = 0

    for( i in 1..10)
    {
        sum += i         // 3+3      sum = 6
        println(i)
    }

    println("summation : $sum")

}