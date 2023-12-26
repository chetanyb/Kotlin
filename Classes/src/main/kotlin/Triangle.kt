import kotlin.math.sqrt

class Triangle (
    val a: Double,
    val b: Double,
    val c: Double
) : Shape(name = "Triangle") {
    init {
        println("$name created with sides $a, $b and $c")
        println()
    }

    override fun perimeter() = a + b + c
    override fun area(): Double {
        val p = perimeter()
        return sqrt((p/2) * ((p/2) - a) * ((p/2) -b) * ((p/2) -c))
    }
}