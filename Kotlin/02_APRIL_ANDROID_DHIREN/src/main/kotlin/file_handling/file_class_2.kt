package file_handling

import java.io.File

fun main()
{
    var file = File("C:\\")

    for(tmpFile in file.listFiles()){
        //println(fileName)

        //var tmpFile = File(file, fileName)
        println("fileName : ${tmpFile.name} => isFile : ${tmpFile.isFile}  isDir : ${tmpFile.isDirectory} isHidden : ${tmpFile.isHidden}" )

    }

}