import kotlin.random.Random

class Circle(
    val radius: Double
) : Shape(name = "Circle") {

//This is a companion object. It is an object tied to the class it is inside, it is a singleton
    companion object {
        fun randomCircle(): Circle {
            val radius = Random.nextDouble(1.0, 10.0)
            return Circle(radius)
        }
    }

    init {
        println("$name created with radius: $radius")
        println("$name area is: ${area()}")
        println("$name's circumference is ${perimeter()}")
    }
    //functions for class circle
    override fun area() = radius * radius * ImportantNumbers.PI
    override fun perimeter() = 2 * ImportantNumbers.PI * radius
}