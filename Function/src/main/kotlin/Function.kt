fun main () {
    print("What do you want me to do: ")
    val doThis = readlnOrNull().toString()
    doSomething(doThis)
    print("What is the base value: ")
    val base = readln().toInt()
    print("To exponent value to calculate: ")
    val exponent = readln().toInt()
    val value = printPower(base, exponent)
    println("$base to the power of $exponent is: $value")
    val product = multiply(base, exponent)
    println("Product of $base and $exponent is $product")
    val list = listOf(1, 2, 3, 4)
    val index = 2
    println("Value at index $index in list $list is ${valueAt(list, index)}")

}
fun doSomething(doingThis: String) {
    println("Yo! I just did $doingThis")
}

fun printPower(base: Int, exponent: Int): Int {
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    return result
}

//Single line function
fun multiply(a: Int, b: Int) = a * b

//function that takes in list input
fun valueAt(list: List<Int>, index: Int) = list[index]