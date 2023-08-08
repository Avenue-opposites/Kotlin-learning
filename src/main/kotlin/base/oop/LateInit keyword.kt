package base.oop

fun main() {
    /*
    在Kotlin中,lateinit关键字用于延迟初始化类属性,它有以下几个主要作用:
        1.lateinit可以对非空类型的变量进行延迟初始化,避免在声明时就要求非空赋值。
        2.lateinit只能用于var变量,不可以用于val变量。
        3.对于lateinit的变量,在首次访问前必须要进行初始化赋值,否则会抛出异常。
        4.lateinit通过延迟初始化,可以避免不必要的空值检查。
        5.lateinit主要用于那些在对象构造之后才能初始化的属性场景。
        6. 并且不能是原始类型。
    */

    val b = B()
    b.setup()
    println(b.value)
}

class B {
    lateinit var value: String
    fun setup() {
        value = "init"
    }
}

