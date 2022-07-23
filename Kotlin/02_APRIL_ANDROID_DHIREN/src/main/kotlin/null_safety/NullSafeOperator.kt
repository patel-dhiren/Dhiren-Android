package null_safety

fun main()
{

    var name:String? = "xyz"      // nullable object

    println("length : ${name?.length}")     // ?. Safe call operator

    var num:Int? = null

    var value = num ?: 0        // ?: elvis operator
    println("value : $value")

    var str:String? = "null"

    if(str!=null)
        println("length : ${str!!.length}")     // not null assertion

}