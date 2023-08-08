package base.oop

fun main() {
    /*
    在Kotlin中,接口(interface)与 Java 中的接口很相似,主要具有以下特点:
        1.接口用 interface 关键字声明
        2.接口只包含抽象方法和属性声明
        3.接口可以实现接口使用 : 语法
        4.接口类可以实现多个接口
        5.接口可以继承其他接口
        6.接口不能含有初始化逻辑
        7.接口成员默认是 public abstract 的
    */

    class A : Runnable {
        override fun run() {
            println("run A")
            doSomething()
        }
    }

    val a = A()
    a.run()
}

interface Runnable {
    fun run()
    fun doSomething() {
        println("do something")
    }
}