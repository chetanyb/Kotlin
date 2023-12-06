fun main () {
    print("Enter the value for x: ")
    // readln() is a function that reads a line from the standard input stream
    var x: Int = readln().toInt()
    print("Enter the value for y: ")
    // readlnOrNull() is a function that reads a line from the standard input stream and returns null if the input is empty
    //the ? is the elvis operator, it returns the value on the left if it is not null, otherwise it returns the value on the right
    var y: Int = readlnOrNull()?.toInt() ?: 0
    if(x > y) {
        println("x > y")
    }
    else if(y > x) {
        println("y > x")
    }
    else {
        println("x = y")
    }
    val simpleExpression = 3 > 4 || 4  > 3 && 4 <= 4
    if(simpleExpression) {
        println("simpleExpression is true")
    }
    else {
        println("simpleExpression is false")
    }
    print("Enter the value for z: ")
    var z = readln().toInt()
    print("Enter the value for bool: ")
    //false is the default value if the input is empty or not "true"
    var bool = readln().toBoolean()
    val hardExpression = !(x != z) && bool || z > (x + y) && (!bool || y < z)
    if(hardExpression) {
        println("hardExpression is true")
    }
    else {
        println("hardExpression is false")
    }
}