package base

fun main() {
    val names = arrayOf("Avenue opposites", "Mosh", "John")
    for (name in names) {
        println(name)
    }

    val arr = arrayOf(1, 2, 3, 'a', "abc")
    for (value in arr) {
        if(value is String) {
            println(value)
        }
    }

    println("max is ${findMax(arrayOf(1,2,3,4,56,100))}")

    for (value in sort(arrayOf(100,99,1,2,3,4,5), false)) {
        println(value)
    }
}

fun findMax(numbers: Array<Int>): Int {
    var max = numbers[0]
    for (value in numbers) {
        if(max < value) {
            max = value
        }
    }
    return max
}

fun sort(numbers: Array<Int>, order: Boolean = true): Array<Int> {
    val len = numbers.size
    var i = 0
    while (i < len - 1) {
        var sign = true
        var j = 0
        while (j < len - i - 1) {
            val con = if(order) numbers[j] > numbers[j+1] else numbers[j] < numbers[j+1]
            if(con) {
                val temp = numbers[j]
                numbers[j] = numbers[j+1]
                numbers[j+1] = temp

                sign = false
            }
            j++
        }

        if(sign) {
            break
        }
        i++
    }
    return numbers
}
