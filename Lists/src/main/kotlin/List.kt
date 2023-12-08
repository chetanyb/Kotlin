fun main () {
    //
    var array = arrayOf(1, 2, 3)
    //values held within list are immutable
    var list = listOf(1, 2, 3)
    //this is invalid list[0] = 5
    //for a mutable list
    var mutableList = mutableListOf(1, 2, 3)
    //to append at end of the mutable list
    mutableList.add(4)
    println(mutableList)
    //remove by value
    mutableList.remove(4)
    println(mutableList)
    //remove by index
    mutableList.removeAt(2)
    println(mutableList)
    var inputList = mutableListOf<Int>()
    for (i in 1..10) {
        val x = readlnOrNull()?.toInt()
        if (x!=null){
            inputList.add(x)
        }
    }
    for (i in 9 downTo 0) {
        println(inputList[i])
    }
    print("Enter a number: ")
    val n = readlnOrNull()?.toInt() ?: 2
    var fibonnaciList = mutableListOf<Int>(0 , 1)
    for (i in 2..n) {
        fibonnaciList.add((fibonnaciList[i-1] + fibonnaciList[i-2]))
    }
    println(fibonnaciList)
}