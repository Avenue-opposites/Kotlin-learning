package base.oop

fun main() {
    /*
    在Kotlin中,密封类(sealed class)是一种受限制的类层次结构,它有以下主要作用:
        1.定义受限的类继承结构
            密封类只允许在同一个文件中子类化,使继承关系更加可控。
        2.加强不变性
            当密封类无子类时,它本质是一个final类,不能再继承。
        3.进行编译时类型检查
            由于子类受限,编译器可以进行检查并确定类型。
        4.用在when表达式中进行枚举
            when的分支可以普遍覆盖所有情况,无需默认分支。
    */

    fun getData(result: Result) = when(result) {
        is Result.Success -> "${result.value} kotlin"
        is Result.Fail -> "${result.value} java"
        else -> "${result.value} not"
    }

    println(getData(Result.Success("yes")))
}

sealed class State(val value: String)

open class Result private constructor(value: String) : State(value) {
    class Success(value: String) : Result(value)
    class Fail(value: String) : Result(value)
}