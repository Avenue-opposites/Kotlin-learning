package base.oop

fun main() {
    /*
    在Kotlin中,companion object可以认为是类的“伴生对象”,它有以下几个主要用途:
        1.用来定义该类的伴生对象,类似于Java中的静态属性和方法。
        2.伴生对象中定义的属性和方法可以由类名直接访问,无需实例化对象。
        3.伴生对象中的成员在编译后会变成类的静态成员。
        4.可以用来实现类似于Java静态常量,单例模式等功能。
        5.一个类只能有一个companion object。
        6.伴生对象是可以命名的默认为Companion
    */

    Calculator.name = "companion object"
    println(Calculator.sum(1,1))
}

class Calculator {
    companion object {
        val PI = 3.14
        var name = "static"
        fun sum(x: Int, y: Int) = x + y
    }
}