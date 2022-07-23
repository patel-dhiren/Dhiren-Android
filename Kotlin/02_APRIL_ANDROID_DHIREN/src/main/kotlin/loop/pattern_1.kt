package loop

/*

*
**
***
****
*****

*/


fun main()
{
    var row = 5

    for(i in 1..row)
    {

        for(i in 1..i)
        {

            print("*")
        }

        println()
    }

}