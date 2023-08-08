package base

fun main() {
    //forLoop()
    whileLoop()
}

fun forLoop() {
    // 范围循环
    val start = 0
    val end = 9
    // .. start到end(包括start和end)
    for( n in start .. end) {
        println(".. -> $n")
    }

    // until ..不包括最后一位
    for( n in start until end) {
        println("until -> $n")
    }

    // .. 的逆序
    for(n in end downTo start) {
        println("downTo -> $n")
    }

    // 字 母范围
    for (c in 'a' .. 'z') {
        println(c)
    }

    for (n in start .. end step 2) {
        println("jump step -> $n")
    }
}

fun whileLoop() {
    var i = 0
    // 循环标签
    label@ while (i < 10) {
        var j = 0
        while (j < i) {
            if(j == 5) {
                println("达成")
                break@label
            }
            j++
        }
        i++
    }
}