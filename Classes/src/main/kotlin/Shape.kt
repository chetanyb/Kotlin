import java.awt.Dimension

// In Kotlin, classes are 'public' by default, meaning they are accessible from anywhere in the project.
// The 'internal' keyword makes the class visible within the same module. A module is a set of Kotlin files compiled together.
// The 'protected' keyword is not applicable to classes but to class members. It makes a member visible to its class and subclasses only.
// The 'public' keyword, which is also the default visibility, allows the class to be accessed from anywhere, not just within the module.
// The 'open' keyword allows a class to be subclassed. Classes in Kotlin are 'final' by default.
// The 'private' keyword restricts the visibility to within the class itself. It's applicable to both classes (nested/inner) and class members.
// For top-level (non-class) declarations, such as functions and properties, the available visibility modifiers are 'public' (default), 'internal', and 'private'.
// Kotlin does not have a package-private visibility like Java. The closest equivalent is 'internal', which is restricted to the same module.

abstract class Shape(
    var name: String
) {
    constructor(name: String, vararg dimension: Double): this(name)
    init {
        println("I am the superclass")
    }

    abstract fun area(): Double
    abstract fun perimeter(): Double
    fun changeName(newName: String) {
        name = newName
    }
}