fun main () {
    val theSet = setOf(
        "one",
        "two",
        "three",
        "two"
    )

    println(theSet)

    for (i in theSet.indices) {
        println(theSet.elementAt(i))
     }
}