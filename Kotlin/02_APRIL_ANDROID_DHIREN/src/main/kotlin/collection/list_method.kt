package collection

fun main() {

    var list = mutableListOf<String>()
    // add
    list.add("Java")
    list.add("Kotlin")
    list.add("Dart")
    list.add("Python")
    list.add("C++")

    println(list)

    // remove
    list.remove("Dart")
    list.removeAt(2)
    println(list)

    list.add(1, "Dart")
    println(list)

    //addAll
    var mList = listOf<String>("Angular", "Django", "ReactJs")
    list.addAll(mList)

    println(list)

    // update
    list[2] = "PHP"
    list.add("C++")
    println(list)

    // indexOf
    list[list.indexOf("Angular")] = "Hibernate"

    println(list)

    // clear
    //list.clear()

    print("Enter value : ")
    var value = readLine()

    // contains
    if(list.contains(value))
    {
        list.removeAt(list.indexOf(value))
        println(list)
    }else{
        println("list does not contains this value")
    }

    // isEmpty
    println(list.isNotEmpty())

    println("lastIndexOf : ${list.lastIndexOf("C++")}")

    println(list)

    // reverse
    list.reverse()
    println(list)

    // shuffle
    list.shuffle()
    println(list)

    // sorting
    list.sort()
    println(list)

    list.sortDescending()
    println(list)

    list.sortBy { s: String -> s.length }

    println(list)

    // remove
    //list.removeIf { s : String -> s.length>3 }
    list.removeIf { s : String -> list.indexOf(s)%2==0 }
    println(list)

}