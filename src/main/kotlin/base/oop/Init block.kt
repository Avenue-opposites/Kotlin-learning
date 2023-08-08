package base.oop

fun main() {
    /*
        在Kotlin中,init块用于初始化类及其实例的一些额外逻辑,它有以下特点:
            1.init块会在类初次加载时执行,并且只会执行一次。
            2.同一个类可以有多个init块,它们会按顺序依次执行。
            3.init块会在主构造函数执行之前执行。
            4.init块内可以访问类中声明的属性和方法。
            init块通常用于以下场景:
                设置属性的默认值
                验证构造参数的合法性
                进行一些耗时的初始化操作
    */

    val person = Person("Avenue opposites")
    println(person.name)
}

class Person {

    init {
        this.name = "init"
        println("Init block 1")
    }

    val age: Int
    var name: String

    init {
        age = 20 // 设置默认值
        println("Init block 2")
    }

    constructor(name: String) {
        this.name = name
        println("Constructor")
    }

}

