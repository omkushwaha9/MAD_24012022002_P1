fun factorial( n : Int ) : Int{
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

fun main(){
    print("Enter a number to find its factorial: ")
    val number = readln().toInt()
    val result = factorial(number)
    println("The factorial of $number is $result")
}