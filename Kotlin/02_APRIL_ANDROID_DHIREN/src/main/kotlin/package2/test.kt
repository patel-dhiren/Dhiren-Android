package package2

open class Test2{

    var num = 454

    protected fun show(){

    }

}

class Demo : Test2(){

    fun display()
    {
        show()
    }

}

fun main()
{

    var t1 = Test2()

    var d1 = Demo()


}