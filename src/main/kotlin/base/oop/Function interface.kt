package base.oop

fun main() {
    /*
    在Kotlin中,函数式接口(Functional Interface)指仅包含一个抽象方法的接口,这类接口通常用于函数式编程。
    函数式接口的特点是:
        1.仅包含一个抽象方法
        2.可以包含默认实现方法
        3.可以包含对象方法(即与接口关联的函数)
        4.用于表示执行操作的函数类型
        5.通常用lambda或函数引用实现
        6.示例包括Runnable,Comparator等
    */

    val myCall = MyCall()
    myCall.call { println("call") }
}

fun interface Callable {
    fun call()
}

class MyCall {
    fun call(item: Callable) {
        item.call()
    }
}