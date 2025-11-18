fun main(){
    val numbers = ArrayList<Int>()
    println("Enter the number of elements:")
    val n = readLine()?.toIntOrNull() ?: 0
    for (i in 1..n) {
        print("Enter element $i: ")
        val num = readLine()?.toIntOrNull() ?: 0
        numbers.add(num)
    }
    if (numbers.isNotEmpty()) {
        val maxNum = numbers.maxOrNull()
        println("Maximum number is: $maxNum")
    } else {
        println("No numbers entered.")
    }
}