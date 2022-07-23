package scoping_function

fun main() {

    // lambda expression having no parameter
    var greeting = { println("Hello guys") }

    greeting()

    // lambdas with parameter and no return type
    var addTwoNumber = { num1:Int, num2:Int -> println("summation : ${num1+num2}")}

    addTwoNumber(12,34)

    // lambdas with parameter and return type
   var addThreeNumbers = {num1:Int, num2:Int, num3:Int -> num1+num2+num3}

   println("addition of three numbers : ${addThreeNumbers(23,657,34)}")

   displayResult(23, addThreeNumbers)

}

fun displayResult(num1:Int, myFunction: (Int, Int, Int) -> Int) {

    var result = myFunction(23,67,89)
    println("higher order result : $result")

}











