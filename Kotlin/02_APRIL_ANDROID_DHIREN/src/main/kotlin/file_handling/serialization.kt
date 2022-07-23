package file_handling

import java.io.*

class Person : Serializable{

    var id:Int = 0
    var name:String
    var email:String

    constructor(id: Int, name: String, email: String) {
        this.id = id
        this.name = name
        this.email = email
    }
}

fun main()
{
    var folder = "Kotlin"
    var fileName = "test.txt"

    try{

        var file = File("C:\\Android")
        println("path : ${file.absolutePath}")

        var root = File(file, folder)

        if(!root.exists()){
            root.mkdir()
        }

        var mFile = File(root, fileName)

        if(mFile.createNewFile()){
            println("file created successfully")
        }

        println("actual path : ${mFile.absolutePath}")

        var message = """
            1. read data from file
            2. write data to file
        """.trimIndent()

        println(message)

        print("Enter your choice : ")
        var choice = readLine()!!.toInt()

        when(choice){

            1 -> readObjectFromFile(mFile)
            2 -> writeObjectToFile(mFile)
            else -> "invalid input"
        }

    }catch (e:FileNotFoundException){
        println("error in creating file")
    }
}

fun writeObjectToFile(mFile: File) {

    var person = Person(12, "Devang", "devang@gmail.com")

    var fout = FileOutputStream(mFile.absolutePath)
    var out = ObjectOutputStream(fout)
    out.writeObject(person)     // Serialization
    out.close()
    fout.close()

    println("data saved successfully")

}

fun readObjectFromFile(mFile: File) {

    var fin = FileInputStream(mFile)
    var oin = ObjectInputStream(fin)
    var person = oin.readObject() as Person     // De-serialization
    println("id : ${person.id}  name : ${person.name}  email : ${person.email}")
    oin.close()
    fin.close()

}
