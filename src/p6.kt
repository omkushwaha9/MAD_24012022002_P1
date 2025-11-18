fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun subtract(a: Int, b: Int, c: Int): Int {
    return a - b - c
}

fun multiply(a: Int, b: Int, c: Int): Int {
    return a * b * c
}

fun divide(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    val a = 763
    val b = 118
    val c = -649

    println("Addition of $a + $b + $c = ${add(a, b, c)}")
    println("Subtraction of $a - $b - $c = ${subtract(a, b, c)}")
    println("Multiplication of $a * $b * $c = ${multiply(a, b, c)}")
    println("Division of $a / $b = ${divide(a, b)}")

}
