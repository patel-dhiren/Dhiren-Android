package exception

class MyException(msg:String) : Exception(msg){
}

class AgeValidator{

    fun validate(age:Int){

        if(age>=18)
        {
            println("eligible to vote")
        }else{
            try{
                throw MyException("not eligible")
            }catch (e:Exception)
            {
                print(e.message)
            }

        }

    }

}


fun main()
{

    var p1 = AgeValidator()
    p1.validate(12)

}