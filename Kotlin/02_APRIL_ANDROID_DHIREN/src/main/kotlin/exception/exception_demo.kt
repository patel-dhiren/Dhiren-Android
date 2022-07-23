package exception

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main()
{

    println("Program starts from here ..")

    try {

        var name:String? = null
        println("value of name : ${name!!.length}")

    }catch (e:NullPointerException){
        println("NullPointerException Handled")
       // println(e.cause?.message)
       // e.printStackTrace()
    }

    try{

        var value = "1234abc"
        println("value = ${value.toInt()+100}")

    }catch (e:NumberFormatException)
    {
        println("NumberFormatException Handled")
    }

    var array = intArrayOf(23,45,67,879,45)

    try {

        println("value at index 2 : ${array[2]}")

    }catch (e:ArrayIndexOutOfBoundsException)
    {
        println("ArrayIndexOutOfBoundsException Handled")
    }


    try {

        var num = 23/0
        println("Num : $num")

    }catch (e:ArithmeticException){
        println("ArithmeticException Handled")
    }

    print("All code executed")

}