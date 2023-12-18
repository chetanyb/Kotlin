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
    val newArray = intArrayOf(1, 2, 3, 4, 5, 300)
    println("The maximum value in 1, 11, 55, 165, 7, 158, 164, ${newArray.joinToString()} is ${getMax(1, 11, 55, 165, 7, 158, 164, *newArray)}")
    teamMaker("Rohit Sharma")
    teamMaker("Hardik Pandya", "Gujrat Titans")
    teamMaker(team = "India")
    print("Enter a number to check if it is even: ")
    val checkEven = readlnOrNull()?.toInt() ?: 0
    println("The input $checkEven is ${if(checkEven.isEven()) "even" else "odd"}")
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

//default parameter
fun teamMaker(captain: String = "Mahendra Singh Dhoni", team: String = "Mumbai Indians") {
    println("The captain of $team is $captain")
}

//vararg
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for(number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

//Single line function
fun multiply(a: Int, b: Int) = a * b

//function that takes in list input
fun valueAt(list: List<Int>, index: Int) = list[index]

//Extension function
fun Int.isEven(): Boolean {
    return this%2 == 0
}