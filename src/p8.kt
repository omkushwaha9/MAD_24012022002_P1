fun main() {
    val array1 = intArrayOf(64, 25, 12, 22, 11, 90, 45, 78, 34, 23)
    println("Array-1 : ${array1.joinToString()}")

    val array2 = Array(5) { 0 }
    println("Array-2 : ${array2.joinToString()}")

    val array3 = Array(5) { it }
    println("Array-3 : ${array3.joinToString()}")

    val array4 = IntArray(5)
    println("Array-4 : ${array4.joinToString()}")

    val array5 = intArrayOf(1, 2, 3, 4, 5)
    println("Array-5 : ${array5.joinToString()}")

    val array6 = arrayOf(
        intArrayOf(1,3),
        intArrayOf(2,4),
        intArrayOf(5,6),
    )
    println("Array-6 : ${array6.contentDeepToString()}")

    val inputArray = IntArray(5)
    println("Enter 5 integers:")
    for (i in inputArray.indices) {
        print("Element ${i + 1}: ")
        inputArray[i] = readLine()?.toIntOrNull() ?: 0
    }
    println("Entered Array: ${inputArray.joinToString()}")

    val builtInSorted = inputArray.sorted()
    println("After sorting by built-in function: ${builtInSorted.joinToString()}")

    println("After sorting by bubble sort:")
    for (i in inputArray.indices) {
        for (j in 0 until inputArray.size - i - 1) {
            if (inputArray[j] > inputArray[j + 1]) {
                val temp = inputArray[j]
                inputArray[j] = inputArray[j + 1]
                inputArray[j + 1] = temp
            }
        }
    }
    println(inputArray.joinToString())

    println("Loops")
    println("Using Range")
    for (i in 1..10) {
        print("$i ")
    }
    println()
    println("Using DownTo")
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()
    println("Using Until")
    for (i in 1 until 10) {
        print("$i ")
    }
    println()
    println("Using ForEach")
    inputArray.forEach { print("$it ") }
    println()
}
