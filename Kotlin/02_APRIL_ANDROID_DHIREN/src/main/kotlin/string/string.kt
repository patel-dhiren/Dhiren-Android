package string
// String - sequence of characters  {'a', 'j', 'a', 'y'} = "ajay"

fun main()
{

    var value:String = "Tops Technologies 1212"
    var letter = 0
    var number = 0
    var space = 0

    for(i in value)
    {
        when {
            i.isLetter() -> {
                letter++
            }
            i.isDigit() -> {
                number++
            }
            i.isWhitespace() -> {
                space++
            }
        }
    }

    println("total letter : $letter")
    println("total number : $number")
    println("total white space : $space")

    var length = value.length

    // length
    println("length of $value = $length")

    var str1 = "tops"
    var str2 = "Tops"

    println("${str1==str2}")

    if(str1==str2)
    {
        println("Both are same")
    }else{
        println("Both are different")
    }

    // equal and equals ignore case
    println("equals : ${str1.equals(str2, ignoreCase = true)}")

    var str3 = "Tops Tech"

    // get()
    println("character at index 2 : ${str3.get(2)}")

    var reverse = str3.reversed()
    println(reverse)

    // replace
    var str4 = "Welcome to Tops Technologies"

    println("replace : ${str4.replace("tops", "Hops", ignoreCase = true)}")

    // split
    var str5 = "Addition/Subtraction/Division/Multiplication"

    var list = str5.split("/", limit = 3)
    println(str5)
    for(element in list)
    {
        println(element)
    }

    // substring
    var str6 = "Welcome to Tops Technologies"

    //var temp = str6.substring(2..20)
    var temp = str6.substring(5, 20)
    println(temp)

    println("toLowerCase : ${str6.lowercase()}")
    println("toUpperCase : ${str6.uppercase()}")

    // trim

    var str7 = "  dhiren@gmail.com    "
    println("length : ${str7.trim().length}")

    // contains
    println("contains : ${str7.contains("dhil")}")

    // plus
    println("plus : ${str7.plus(str6)}")

    // sub string

    var s4 = "Tops Technologies"

    println("substring : ${s4.substring(2..5)}")


}
