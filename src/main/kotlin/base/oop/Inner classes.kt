package base.oop

fun main() {
    /*
    在Kotlin中,内部类的主要特点如下:
        1.内部类可以直接访问外部类的成员属性和方法,包括私有成员。
        2.内部类会带有外部类的实例引用,可以使用该引用访问外部类成员。
        3.创建内部类实例时,必须首先存在外部类的实例。
        4.外部类只能通过内部类的实例引用访问内部类的成员。
        5.内部类与外部类互不影响,内部类的成员名称可以与外部类成员名称相同。
        6.静态内部类使用 companion object 定义。
    */

    val outer = Outer()
    val inner = outer.Inner()
    inner.accessOuter()
}

class Outer {
    val name = "外部类"
    inner class Inner {
        val name = "内部类"
        fun accessOuter() {
            println(this@Outer.name + name)
        }
    }
}