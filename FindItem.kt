fun main () {
    val li = listOf(
        "one",
        "two",
        "three"
    )

    println("list: ")
    println(li)

    val len = li.size

    for(val i = 1; i<=len; i++){
        if li[i] == "two"
        println("found two at")
        println(i)
    }

    val r = li.filter { it.startsWith("two") }
    val r2 = li.filter { it.startsWith("four") }

    println(r)
    println(r2)

}

