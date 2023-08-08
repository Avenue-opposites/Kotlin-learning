package base.oop

fun main() {
    /*
    在Kotlin中,抽象类(abstract class)是指不能直接实例化,只能被继承的类。
    抽象类的主要作用有:
    1.对类进行部分抽象
        抽象类允许包含抽象(abstract)成员,使类达到部分抽象的效果。
    2.定义子类的通用接口
        抽象类中定义共性功能,子类实现个性化功能。
    3.提取子类的公共行为
        通过抽象类提取子类的共性,实现代码复用。
    4.规范子类的开发
        强制要求子类实现某些方法或属性,规范子类开发。
    5.禁止实例化
        抽象类不能被实例化,只用于继承。
    */

    val circle = Circle(2.0)
    println(circle.area())
}

abstract class Shape {
    abstract fun area(): Double
}

class Circle(var radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}