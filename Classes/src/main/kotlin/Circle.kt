class Circle(
    val radius: Double
) {
    val pi = 3.14
    init {
        println("Circle created with radius: $radius")
        println("Circle area is: ${area()}")
        println("Circle's circumference is ${perimeter()}")
    }
    //functions for class circle
    fun area() = radius * radius * pi
    fun perimeter() = 2 * pi * radius
}