package file_handling

import java.io.File
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


    }catch (e:IOException){
        println("error in creating file")
    }
}