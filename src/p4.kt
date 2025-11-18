fun main(){
    print("Enter a number : ")
    val number = readln().toInt()
    if (number % 2 == 0) {
        println("$number is an even number.")
    } else {
        println("$number is an odd number.")
    }
}