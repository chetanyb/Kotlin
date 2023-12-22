//The constructor is defined in the class header and is called the primary constructor
class Rectangle(
    //this is inside the constructor
    val length: Double,
    val breadth: Double
) {
    //The init block is always called after the primary constructor
    init {
    println("Rectangle created with length $length and breadth $breadth")
    }
    //functions for the class rectangle
    fun area() = length * breadth
    fun perimeter() = 2 * length + 2 * breadth
    fun isSsquare() = length == breadth
}