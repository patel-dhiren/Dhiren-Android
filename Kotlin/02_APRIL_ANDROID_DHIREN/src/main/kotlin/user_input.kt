fun main()
{

    print("Enter num1 : ")
    var num1:Int = readLine()!!.toInt()   // convert string to int

    print("Enter num2 : ")
    var num2:Float = readLine()!!.toFloat()     // convert string to float

    println("addition of $num1 and $num2 : ${num1+num2}")

    // String input
    print("Enter Name : ")
    var name:String = readLine()!!.toString()
    println("name : $name")

    // char input
    print("Enter character : ")
    var ch:Char = readLine()!![0]

    println("value of ch : $ch")

}