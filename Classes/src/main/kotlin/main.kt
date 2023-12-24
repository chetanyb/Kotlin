fun main() {
    val myRect = Rectangle(99.99, 44.99)
    val myCircle = Circle(5.51)
    val myTriangle = Triangle(2.51, 5.51, 4.51)
    println("Changing name of Rectangle to Racoon")
    myRect.changeName("Racoon")
    println("myRect.name: ${myRect.name}")

    println("The perimeter of triangle is ${myTriangle.perimeter()}")
    println("The area of triangle is ${myTriangle.area()}")
}