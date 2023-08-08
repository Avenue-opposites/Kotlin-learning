package base.oop

fun main() {
    // Kotlin中的类默认都是final的
    val cat = Cat()
    val cat1 = Cat1("tt", "mm", "blue", 8)
}

// 默认属性,无构造函数
class Cat {
    val name = "ff"
    val model = "not"
    var color = "red"
    var wheel = 0

    fun move() {
        println("This cat is moving.")
    }
    fun stop() {
        println("This cat is stopped.")
    }
}

class Cat1(val name: String = "ff", val model: String = "not", var color: String = "red", var wheel: Byte = 4) {
    fun move() {
        println("This cat is moving.")
    }
    fun stop() {
        println("This cat is stopped.")
    }
}