package base.oop

fun main() {
    /*
    在Kotlin中,委托(delegation)是一种设计模式,其主要特点和作用有:
    1.可以复用接口的实现逻辑
        将接口实现委托给其他对象,达到复用代码的目的。
    2.可以组合复用多个委托实现
        一个类可以同时委托给多个其他对象的接口实现。
    3.可以动态改变委托实现
        委托实例可以在运行时改变,实现动态行为。
    4.适合面向接口编程
        委托与接口配合,可以抽象具体实现。
    5.提高代码扩展性和维护性
        委托可以在不修改原类代码的情况下动态增强功能。
    6.语法简洁,使用by关键字声明委托
        例如: class Derived(b: Base) : Base by b
    */

    val b = BaseImpl(10)
    val d = Derived1(b)
    d.print()
}

interface IBase {
    fun print()
}

class BaseImpl(val x: Int) : IBase {
    override fun print() { print(x) }
}

class Derived1(b: IBase) : IBase by b // 委托给b实现Base接口