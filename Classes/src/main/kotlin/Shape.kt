//a class is private by default
//internal keyword allows the class to be used within the module
//public keyword allows the class to be used outside the module
//open keyword allows the class to be inherited
open class Shape(
    var name: String
) {
    init {
        println("I am the superclass")
    }

    fun changeName(newName: String) {
        name = newName
    }
}