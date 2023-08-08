package base.oop

fun main() {
    // 命名参数
    val a = A(b = 2, a = 1)
    println(a.a)
}

class A(val a: Int = 0, val b: Int = 0)