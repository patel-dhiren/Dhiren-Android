package decision_making

fun main()
{
    var str = "Java"

    var result = when(str)
    {
        "Java", "Python", "Dart", "Kotlin" -> {
            println("case match with $str")
            "language"
        }
        "Angular", "Flutter", "React" -> {
            "Framework"
        }
        else -> "Not Frame work or language"
    }

    println("$str is $result")

}