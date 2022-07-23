package exception

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {

    println("Program starts from here ..")

    try {

        var name: String? = "abc"
        println("value of name : ${name!!.length}")

        var value = "1234"
        println("value = ${value.toInt() + 100}")

        var array = intArrayOf(23, 45, 67, 879, 45)
        println("value at index 2 : ${array[2]}")

        var num = 23 / 0
        println("Num : $num")

    } catch (e: NullPointerException) {
        println("NullPointerException Handled")
        // println(e.cause?.message)
        // e.printStackTrace()
    } catch (e: NumberFormatException) {
        println("NumberFormatException Handled")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException Handled")
    } catch (e: ArithmeticException) {
        println("ArithmeticException Handled")
    }


    print("All code executed")

}