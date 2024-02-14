fun main () {
    val theMap = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3
    )

    val theFruitMap = mapOf(
      1 to "apple",
      2 to "banana",
      3 to "catfish"

    )

    println(theMap)

    for ((k, v) in theMap){
        println("$k = $v")
    }

    println(theFruitMap)

}