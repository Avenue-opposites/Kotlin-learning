package base.oop

fun main() {
    /*
    在Kotlin中,次级构造函数是除了主构造函数之外的其他构造函数。它有以下几个特点:
        1.每个类都只能有一个主构造函数,但可以有多个次级构造函数。
        2.次级构造函数只能委托给主构造函数或其他次级构造函数。
        3.次级构造函数语法为 constructor关键字加构造函数参数。
        4.如果类有主构造函数,每个次级构造函数必须委托给主构造函数,直接或间接。
        5.如果类没有主构造函数,每个次级构造函数必须委托给其他次级构造函数,直到一个构造函数初始化了所有属性。
    */

    val u1 = User("古月","方源", 500)
    val u2 = User("p", "zj")
    val u3 = User("Avenue")
    println(u1.firstName + u1.lastName)
    println(u2.firstName + u2.lastName)
    println(u3.firstName + u3.lastName)
}

class User(var firstName: String, var lastName: String, var age: Int) {

    // 次级构造函数,委托给主构造函数
    constructor(firstName: String, lastName: String) : this(firstName, lastName, 19) {
        println("委托给主构造")
    }
    constructor(firstName: String) : this(firstName, "-opposites") {
        println("委托给另一个次级构造")
    }
}

