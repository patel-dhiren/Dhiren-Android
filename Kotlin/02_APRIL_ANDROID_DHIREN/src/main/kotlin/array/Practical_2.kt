package array

fun main()
{
    var colors = arrayOf("Red", "Green","Blue","Black", "Grey")

    colors.sort()

    for(color in colors)
    {
        println("$color")
    }

}