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
    override fun area() = radius * radius * pi
    override fun perimeter() = 2 * pi * radius
}