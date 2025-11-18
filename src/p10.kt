class Car(
    var type: String,
    var model: Int,
    var price: Double,
    var owner: String,
    var milesDriven: Int
) {
    init {
        println("Object of class is created and Init is called.")
    }

    fun getCarInfo(): String {
        return "Car Information: $type, $model\nCar Owner: $owner\nMiles Drive: $milesDriven"
    }

    fun getOriginalCarPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        return price - (milesDriven * 5)
    }

    fun displayCarInfo() {
        println("----------")
        println(getCarInfo())
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentPrice()}")
        println("----------")
    }
}

fun main() {
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("BMW", 2018, 100000.0, "Aman", 105)
    car1.displayCarInfo()

    println("Creating Car Class Object car2 in next line")
    val car2 = Car("BMW", 2019, 400000.0, "Karan", 20)
    car2.displayCarInfo()

    println("******* ArrayList of Car **************")
    val carList = ArrayList<Car>()
    carList.add(Car("Toyota", 2017, 1080000.0, "KJS", 100))
    carList.add(Car("Maruti", 2020, 4000000.0, "NPP", 200))

    for (car in carList) {
        car.displayCarInfo()
    }
}
