import kotlin.random.Random

//The constructor is defined in the class header and is called the primary constructor
class Rectangle(
    //this is inside the constructor
    val length: Double,
    val breadth: Double
) : Shape(name = "Rectangle") {
    //the below constructors are called secondary constructors
    //The secondary constructor must call the primary constructor
    constructor(a: Double) : this(a, a)

    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    companion object {
        fun randomRectangle(): Rectangle {
            val side1 = Random.nextDouble(1.0, 10.0)
            val side2 = Random.nextDouble(1.0, 10.0)
            return Rectangle(side1, side2)
        }
    }

    //The init block is always called after the primary constructor
    init {
        println("$name created with length $length and breadth $breadth")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
        println("Is $name a square: ${isSquare()}")

    }
    //functions for the class rectangle
    override fun area() = length * breadth
    override fun perimeter() = 2 * length + 2 * breadth
    fun isSquare() = length == breadth
}
