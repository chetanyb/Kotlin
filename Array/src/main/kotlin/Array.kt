fun main () {
    var myArray = arrayOf(1 , 2, 3, "array in kotlin can hold heterogeneous data types")
    for ( i in myArray ) {
        println(i)
    }
    //or we can do
    //NOTE: both are inclusive
    for ( i in 0..3 ) {
        println(myArray[i])
    }
    //for reverse order
    for ( i in 3 downTo 0 ) {
        println(myArray[i])
    }
    //for steps
    for ( i in 3 downTo 0 step 2 ) {
        println(myArray[i])
    }
    var sum: Int = 0
    for ( i in 0..4) {
        print("Enter the number ${i+1}: ")
        sum += readlnOrNull()?.toInt() ?: 0
    }
    println("Average of entered numbers is: ${sum/5}")
}