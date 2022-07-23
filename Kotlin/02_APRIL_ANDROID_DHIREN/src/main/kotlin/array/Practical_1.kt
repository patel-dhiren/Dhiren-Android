package array

fun main()
{

    var nums = intArrayOf(12,45,78,34,23,12)

    nums.sort()     // sort array

    println("size of an array : ${nums.size}")

    println("value at index 3 : ${nums[3]}")
    println("value at index 3 : ${nums.get(3)}")        // get
    nums.set(3,99)        // set

    nums.sortDescending()

    for(index in nums.indices){
        println("value at $index = ${nums[index]}")
    }

    for(element in nums)
    {
        if(element%2==0)
            println("$element = Even number")
        else
            println("$element = Odd number")

        // to get index on the basis of value
        println("index of $element = ${nums.indexOf(element)}")

    }

}