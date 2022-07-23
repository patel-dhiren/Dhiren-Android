package scoping_function

data class Item(var id:Int, var name:String, var price:Float = 0.0f){

    fun display()
    {
        println("id : $id  name : $name  price : $price")
    }

}

class Person{

    var id:Int = 0
    var name:String? = null
    var age:Int = 0

}

// apply - deal with not null object , initialization
// let - let generally used with nullable object
// also - used to add additional changes in already initialized object
// run - with+let user with nullable object

fun main()
{

    // apply
    var item = Item(12, "Titan", 3322.50f)
    item.display()

    Item(3, "fastrack").apply {
        price = 5554.50f
        println(this)
    }

    var person = Person().apply {
        id = 111
        name = "Haresh"
        age = 12
    }

    // also
    person.also {
        it.age = 34
    }.also {
        println("id : ${it.id}  name : ${it.name}  age : ${it.age}")
    }

    // with

    var p1 = with(person){
        name = "abc"
        println(this.age)
    }


    // let
    var name:String? = "Tops Tech"

  /*  if(name!=null)
    {
        println("length of string : ${name?.length}")
    }*/

    var result = name?.let {
        "length of string : ${it.length}"
    }



    result?.run {
        println("length of a string : $length")
        println("${isEmpty()}")
        println("${substring(2..4)}")
    }

    println(result)



}