fun main () {
    //Integer variables
    var x: Int = 5
    var y: Int = 11
    println("x: $x and y: $y")
    println("The result of x + y is: ${x + y}")
    x += 10
    println("The result of updated x / y is: ${x / y}")

    //val declarations are immutable
    val z:Int = 5
    /*This is incorrect
    z += 5*/

    //declaring a boolean variable
    var bool: Boolean = false

    //String and char variable
    var a: String = "This is a string"
    var b: Char = 'h'
    //var c: String = a + " and this is a char " + b
    //or
    var c: String = "$a and this is a char $b"
    println(c)

    //Float and double variables
    var f = 5.51
    var g = 8
    var h: Double = f/g
    println("Result of f / g is: $h")
    //but if we explicitly declare variables as float
    var i: Float = 5.51F
    var j: Float = 8F
    var k: Double = (i / j).toDouble()
    println("Result of i / j is: $h")
}