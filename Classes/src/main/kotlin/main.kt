fun main() {
    val myRect = Rectangle(99.99, 44.99)
    print("Enter the radius: ")
    val radius = readln().toDouble()
    val myCircle = try {
        Circle(radius)
    } catch(e: NegativeRadiusException) {
        Circle(-radius)
    } finally {
        //myCircle not available here
        println("Circle created")
    }
    println("Radius of circle: ${myCircle.radius}")
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

    //creating a custom shape
    //this is an anonymous class
    val a = 3.0
    val b = 4.0
    val height = 2.5
    val myParallelogram = object : Shape("Parallelogram", a, b, height){
        init {
            println("Parallelogram created with a= $a, b = $b and height = $height")
            println("The area is ${area()}")
            println("The perimeter is ${perimeter()}")
            println("Is the parallelogram a rectangle: ${isRectangle()}")

        }
        override fun area(): Double {
            return a * height
        }

        override fun perimeter(): Double {
            return 2 * a + 2 * b
        }


        fun isRectangle(): Boolean = height == b

    }

    val c = 3.5
    val d = 4.0

    val myTrapezium = object: Shape("Trapezium", a, b, c, d, height) {

        init {
            println("Trapezium created with a: $a, b: $b, c: $c, d: $d and height: $height")
            println("Area of trapezium: ${area()}")
            println("Perimeter of trapezium: ${perimeter()}")
            println("Is the parallelogram a rectangle: ${isRectangle()}")

        }

        override fun area(): Double {
            return ((a+b)/2) * height
        }

        override fun perimeter(): Double {
            return a + b + c + d
        }

        fun isRectangle(): Boolean = a == b && c == d
    }

    var shapes = listOf(myRect, myCircle, newCircle, myParallelogram, myTriangle)
    shapes = shapes.customFilter {it.area() > 20.0}
    var integers = (1..10).toList().customFilter { it % 2 == 0 }
    var customTriple = CustomTriple<Int, String, Boolean>(3, "kotlin", true)
    customTriple.printTypes()
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
//lambda function
//lambda functions are anonymous functions that can be passed around as variables
//lambda functions are defined with curly braces
//lambda functions can be passed as arguments to other functions
val customSum = { numbers: List<Int>, condition: (Int) -> Boolean -> numbers.filter(condition).sum()}
/* or this
fun List<Int>.customSum(sumFunction: (Int) -> (Boolean)): Int {
    var sum = 0
    for (item in this) {
        if (sumFunction(item)) {
            sum += item
        }
    }
    return sum
}
 */

//We can limit the generic through this syntax: "<T :Number>" or "<T: Shape>"
fun <T> List<T>.customFilter(filerFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()
    for (item in this) {
        if (filerFunction(item)) {
            resultList.add(item)
        }
    }
    return resultList
}