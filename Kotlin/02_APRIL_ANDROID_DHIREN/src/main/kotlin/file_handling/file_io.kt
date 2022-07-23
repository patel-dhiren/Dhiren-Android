package file_handling

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

fun main()
{
    var folder = "Kotlin"
    var fileName = "sample.txt"

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

            1 -> readData(mFile)
            2 -> writeData(mFile)
            else -> "invalid input"
        }

    }catch (e:IOException){
        println("error in creating file")
    }
}

fun writeData(mFile: File) {

    print("Enter message : ")
    var message = readLine()

    var fout = FileOutputStream(mFile.absolutePath, true)
    fout.write(message?.toByteArray())
    fout.close()

    println("data saved successfully")

}

fun readData(mFile: File) {

    var fin = FileInputStream(mFile)
    //println("available size : ${fin.available()}")
    var byteArray = ByteArray(fin.available())
    fin.read(byteArray)

    // to convert byteArray into String
    var message = String(byteArray)
    println(message)

    fin.close()

}
