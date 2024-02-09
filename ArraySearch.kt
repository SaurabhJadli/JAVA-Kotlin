    fun main() {
        val numbers = arrayOf(12, 45, 78, 3, 90, 21)
        val numberToFind = 3

        println("Array:")
        for (number in numbers) {
            print(number)
            print(" ")
        }
    
        println("\n\nNumber to find: $numberToFind")
        val index = numbers.indexOf(numberToFind)
    
        if (index != -1) {
            println("Number $numberToFind found at index $index")
        } 
        else {
            println("Number $numberToFind not found in the array")
        }
    }

