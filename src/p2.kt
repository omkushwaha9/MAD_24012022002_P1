fun main(){
    var intvalue : Int = 11
    println("Integer Value  = $intvalue")
    var doubleValue : Double = intvalue.toDouble()
    println("Double Value (From Int) = $doubleValue")

    var stringValue : String = "125"
    var intValue : Int = stringValue.toInt()
    println("Integer Value (From String) = $intValue")

    var doubleString : Double = stringValue.toDouble()
    println("Double Value (Form String) $doubleString")
}
