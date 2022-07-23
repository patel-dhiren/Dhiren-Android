package oops

class Person( var id:Int, var name:String, var age:Int){

    private var email:String = ""

    // this keyword is also used to invoke current class constructor
    constructor(id:Int, name:String, age:Int, email:String) : this(id, name, age)
    {
        this.email = email
    }

    fun show()
    {
        println("id : $id name : $name age = $age email  = $email")
    }

}

fun main()
{

    var p1 = Person(12, "abc", 45)
    var p2 = Person(44, "xyz", 12, "xyz@gmail.com")
    p1.show()
    p2.show()
}