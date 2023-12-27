fun main() {
    val myRect = Rectangle(99.99, 44.99)
    val myCircle = Circle(5.51)
    val myTriangle = Triangle(2.51, 5.51, 4.51)
    val square = Rectangle(5.0)
    println("Changing name of Rectangle to Racoon")
    myRect.changeName("Racoon")
    println("myRect.name: ${myRect.name}")

    println("The perimeter of triangle is ${myTriangle.perimeter()}")
    println("The area of triangle is ${myTriangle.area()}")

    val maxAreaRectangleAndCircle = maxArea(myRect, myCircle)
    val maxAreaRectangleCircleAndTriangle = maxArea(myRect, myCircle, myTriangle)

    println("The max area of rectangle and circle $maxAreaRectangleAndCircle")
    println("The max area of rectangle, circle and triangle is $maxAreaRectangleCircleAndTriangle")

    val myList: List<Int> = listOf(1, 2, 3, 4, 5)
    val myArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("alternatePrinter with List")
    alternatePrinter(myList)
    println("alternatePrinter with Array")
    alternatePrinter(myArray)

    //creating a random circle
    val newCircle = Circle.randomCircle()

}

fun maxArea(shape1: Shape, shape2: Shape): Double {
    val areaShape1 = shape1.area()
    val areaShape2 = shape2.area()
    return if(areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1: Shape, shape2: Shape, shape3: Shape): Double {
    val maxAreaShape1Shape2 = maxArea(shape1, shape2)
    val areaShape3 = shape3.area()
    return if(maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}

fun alternatePrinter(a: List<Int>) {
    var counter = 0
    for (i in a.size-1 downTo 0 ) {
        println(a[counter])
        if (i == counter) break else counter++
        println(a[i])
    }
}

fun alternatePrinter(a: Array<Int>) {
    var counter = 0
    for(i in a.size-1 downTo 0) {
        println(a[counter])
        if(i == counter) break else counter++
        println(a[i])
    }
}