package oops

class Product{

    var pId:Long = 0
    var color:String =""
    var name:String = ""
    var rating:Float = 0.0f
    var likes:Int = 0
    var mrpPrice:Double = 0.0
    var offer:Int = 0
}

class Student{

    // states or data members
    var roll:Int = 0
    var name:String = ""
    var contact:String = ""
    var course:String = ""

    // Default constructor or no parameter constructor
    constructor()
    {

    }

    // this is a reference variable which refers current class object

    // parameterized parameter constructor
    constructor(roll:Int, name:String, contact:String, course:String)
    {
        this.roll = roll
        this.name = name
        this.contact = contact
        this.course = course
    }


    // member function or behavior

    fun setData(roll:Int, name:String, contact:String, course:String)
    {
        this.roll = roll
        this.name = name
        this.contact = contact
        this.course = course
    }
    fun getStudentContact() : String
    {
        return contact
    }

    fun showDetail()
    {
        println("roll : $roll, name : $name, course : $course, contact :${getStudentContact()}")
    }



}

fun main()
{
    // Syntax : var or val objName:ClassName = className();

    var s1 = Student()      // here Student() is constructor
                            // s1 is object of class Student
    // initialization of object using reference
    s1.roll = 12
    s1.name = "Umang"
    s1.course= "Android"
    s1.contact = "4545454545"

    // by method
    var s2 = Student()
    s2.setData(15, "Ajay", "5675675675", "Flutter")

    s1.showDetail()
    s2.showDetail()

    // by constructor
    var s3 = Student(34, "Gayatri", "6786786786", "Android")
    s3.showDetail()
}
