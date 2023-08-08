package base

fun main() {
    // Kotlin函数参数不可变
    // Unit类型和typescript和C的void一样
    sayHello("Avenue opposites")
    println("top fun pow ${pow(2,2)}.")

    // 内部函数
    fun add(x: Int, y: Int) = x + y
    //函数重载
    fun add(x: Double, y: Double) = x + y

    println("internal fun add ${add(1,1)}.")
    println("fun add overload ${add(1.3,2.2)}")

    //参数默认值
    fun to(path: String = "/") {
        println("to $path")
    }

    to()
    to("/about")

    //剩余参数列表
    fun sum(vararg numbers: Int): Int {
        var res = 0
        for( number in numbers) {
            res += number
        }
        return res
    }
    println("sum is ${sum(1,2,3)}")

    // lambda函数类型
    //多行需要加run{ code... },并且可以省略return
    var concat: (s1: String, s2: String) -> String = {
        s1, s2 -> "$s1 & $s2"
    }
    println(concat("阴阳师", "决战平安京"))

    concat = {
        s1, s2 -> run {
            var res = ""
            res += s1.plus("s1")
            res += " X "
            res += s2.plus("s2")
            res
        }
    }
    println(concat("阴阳师", "决战平安京"))

    //当只有一个参数时可以使用it关键字代替
    val toDouble: (n: Int) -> Double = {
        it -> (it * 2).toDouble()
    }

    //传递函数类型参数
    fun advanceFun(n: Int, fn: (x: Int, y: Int) -> Int): Int {
        val res = fn(n, n * 3)
        return res + 1
    }

    println("advanceFun return value is ${advanceFun(5) { x, y -> x + y }}")
}

fun sayHello(name: String) {
    println("Hello, $name.")
}

fun pow(n: Int, i: Int): Int {
    var res = 1
    var j = 0
    while (j < i) {
        res *= n
        j++
    }
    return res
}