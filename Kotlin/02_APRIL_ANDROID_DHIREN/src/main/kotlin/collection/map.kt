package collection

fun main() {

    var map = mapOf<Int, String>( 11 to "Java", 2 to "Android", 33 to "IOS")

    var value = map[3]
    println("value : $value")

    for(key in map.keys){
        println(key)
    }

    for(value in map.values){
        println(value)
    }

    println("size of map : ${map.size}")

    for(entry in map.entries){
        println("key : ${entry.key}  value : ${entry.value}")
    }

    map.forEach { (key, value) ->  println("key : $key  value : $value") }

    var mMap = mutableMapOf<Int, String>()
    mMap[23] = "Red"  // mMap.put(23, "Red")
    mMap[11] = "Black"
    println(mMap)
    // remove
    print("Enter key for remove element from map : ")
    var key = readLine()!!.toInt()
    mMap.remove(key)

    println(mMap)

    mMap[2] = "Yellow"
    mMap[33] = "White"
    // replace
    println(mMap)

    mMap.replace(2, "Blue")

    println(mMap)
}