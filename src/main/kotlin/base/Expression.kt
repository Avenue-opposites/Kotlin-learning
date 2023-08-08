package base

import kotlin.math.floor

fun main() {
    val state = Math.random() > 0.5

    if(state) {
        println("state true")
    }else {
        println("state false")
    }

    // 三元表达式
    val name = if(Math.random() > 0.5) "Avenue opposite" else "none"

    println(name)

    val alarm = floor((Math.random() * 11) + 1).toInt()
    // 相当于switch语句, 但是有三点不同：
    // 1.使用in运算符来判断是否中某个范围内(范围检查)
    // 2.可以返回值
    // 3.可以不使用括号,直接在when块中使用表达式
    val text = when(alarm) {
        12, 11 -> "This time is $alarm."
        in 1..10 -> "The number is in the range 1..10"
        else -> "none."
    }

    val text1 = when {
        alarm > 10 -> "This time is $alarm."
        alarm in 1..10 -> "The number is in the range 1..10"
        else -> "none."
    }

    println("$text == $text1")
}