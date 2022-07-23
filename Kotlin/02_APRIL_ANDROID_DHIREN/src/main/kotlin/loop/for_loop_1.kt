package loop

fun main()
{
    var num = 10

    for( i in 1..num)
    {
        print("$i  ")
    }

    println()
    num = 15

    for( i in 1 until num+1)
    {
        print("$i  ")
    }

    println()
    num = 10

    for(i in num downTo 5){
        print("$i  ")
    }

    println()

    for(i in 1..num step 2)
    {
        print("$i  ")
    }

}