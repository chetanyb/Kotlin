fun main () {
    print("What do you want me to do: ")
    val doThis = readlnOrNull().toString()
    doSomething(doThis)
    print("What is the base value: ")
    val base = readln().toInt()
    print("To exponent value to calculate: ")
    val exponent = readln().toInt()
    printPower(base, exponent)
}
fun doSomething(doingThis: String) {
    println("Yo! I just did $doingThis")
}

fun printPower(base: Int, exponent: Int) {
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is: $result")
}