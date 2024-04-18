package Task1

fun main(args: Array<String>) {

    var car = Car("Car_1",100.0,"red")

    println(car)

    println(car.colorChange("Yellow"))
            println( car.powerOn(50.0))
            println( car.powerLess(40.0))
            println(car.nameChange("Car_1.1"))

    println(car)
}