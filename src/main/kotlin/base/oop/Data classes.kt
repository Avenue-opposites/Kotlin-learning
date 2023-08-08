package base.oop

fun main() {
    /*
    在Kotlin中,数据类(data class)是一种方便存储数据的类,它具有以下主要特点:
        1.自动生成equals()、hashCode()、toString()方法
            数据类自动派生这些方法来简化相等性比较。
        2.具有componentN()函数
            可以通过 it.component1()等轻松获取属性值。
        3.可以通过copy()函数复制实例
            copy()支持便捷地复制实例并修改部分属性。
        4.提供解构语法
            可以通过val (a, b) = obj语法对数据类进行解构。
        5.编译器会生成final属性
            属性默认为final,保证数据不可变性。
        6.适用于表示简单数据的类
            数据类通常用来保存同质数据对象集合。
    */

    val point = Point(1, 2)
    println(point)
}

data class Point(val x: Int, val y: Int)