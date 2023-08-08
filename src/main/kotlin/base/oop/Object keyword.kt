package base.oop

fun main() {
    /*
    在 Kotlin 中,object 关键字有以下两种主要用法:
    1.声明单例
        可以使用 object 直接声明一个单例对象
    2.声明伴生对象
        在类内部使用 object 声明一个伴生对象
    3.object 表达式可以用来创建匿名内部类或临时对象实例
    */

    Singleton.doSomething()

    MyClass.doSomething()

    val button = Button("click", object : ClickListener {
        override fun onClick() {
            println("click")
        }
    })
}

//单例
object Singleton {
    fun doSomething() {
        println("do something")
    }
}

//伴生对象
class MyClass {
    companion object {
        fun doSomething() {
            println("do something")
        }
    }
}

//匿名内部类
interface ClickListener {
    fun onClick()
}
class Button(label: String, clickListener: ClickListener)
