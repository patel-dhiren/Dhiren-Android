package data_class

data class User(
    var id:Int,
    var name:String,
    var email:String
)

fun main()
{
    var user = User(12, "xyz", "xyz@gmail.com")

    // toString
    println(user)

    var user1 = User(12, "xyz", "xyz@gmail.com")

    // equals
    println(user==user1)

    // hashcode
    println(user.hashCode())
    println(user1.hashCode())

    // copy
    var user2 = user.copy(id = 23, name = "Montu")
    println(user2)

    var(id:Int, name:String, email:String) = user2

    println("id : $id")
    println("name : $name")
    println("email : $email")

}
