package oops

// Primary constructor
class Item(var itemId:Int =0, var itemName:String = "", var itemPrice:Float= 0.0f){
    //Primary Constructor and Initializer Blocks
    // to initialize primary constructor member
    init {
        println("id : $itemId, name : $itemName, price : $itemPrice")
    }


}

fun main()
{
    var i1 = Item(12, "Shirt", 456.67f)
    var i2 = Item()

}