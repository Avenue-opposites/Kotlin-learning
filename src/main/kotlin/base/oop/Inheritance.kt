package base.oop

fun main() {
    /*
    在Kotlin中,类的继承与Java中非常相似,语法为:
        子类名后使用":"号来继承父类
        使用open标记类可继承
        派生类构造函数必须委托给父类构造函数
        子类可以重写父类的开放成员
        子类可以调用父类的成员使用super关键字
        子类可以通过super初始化父类
    */
    val d = Derived("Avenue opposites")
    println(d)
}

open class Base(val id: Int) {
    override fun toString(): String {
        return "Base { " +
                "id: $id" +
                " }"
    }
}

class Derived(var name: String, id: Int = 0) : Base(id) {
    override fun toString(): String {
        println(super.toString())

        return "Derived { " +
                "name: $name" +
                " }"
    }
}