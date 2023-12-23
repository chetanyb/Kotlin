import kotlin.math.sqrt

class Triangle (
    val a: Double,
    val b: Double,
    val c: Double
) {
    init {
        println("Triangle created with sides $a, $b and $c")
        println()
    }

    fun perimeter() = a + b + c
    fun area(): Double {
        val p = perimeter()
        return sqrt((p/2) * ((p/2) - a) * ((p/2) -b) * ((p/2) -c))
    }
}