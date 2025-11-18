

fun main() {
    var a : Int = 10
    var b : Int = 20
    println("Before swapping: a = $a, b = $b")
    a = a + b
    b = a - b
    a = a - b
    println("After swapping: a = $a, b = $b")

}