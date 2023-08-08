package base

fun main() {
    // 如果可能为null需要在类型后加?
    var string: String? = if(Math.random() > 0.5) "apple" else null
    // ?.为可选链接符如果string为null则返回null
    val len: Int? = string?.length

    println("string the length is $len.")

    if(string != null) {
        println("string is $string.")
    }else {
        println("This is null.")
    }

    var string1: String? = "Avenue opposite"

    //!!.为非空断言符
    println("string1 the length is ${string1!!.length}.")

    string1 = if(Math.random() > 0.5) string1 else null

    //类似与javascript的??空赋值运算符
    val text = string1 ?: "default"

    println("text is $text.")
}