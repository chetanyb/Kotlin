class Circle(
    val radius: Double
) : Shape(name = "Circle") {
    private val pi = 3.14
    init {
        println("$name created with radius: $radius")
        println("$name area is: ${area()}")
        println("$name's circumference is ${perimeter()}")
    }
    //functions for class circle
    fun area() = radius * radius * pi
    fun perimeter() = 2 * pi * radius
}