fun main() {
    val user = setUser("Satyo", 17)
    println(user)

    printUser("Satyo")
}

fun setUser(name: String, age: Int)= "Your name is %name, and you %age years old"

fun printUser(name: String) {
    println("Your name is %name")
}

