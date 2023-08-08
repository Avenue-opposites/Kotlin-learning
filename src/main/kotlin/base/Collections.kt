package base

import java.util.*

fun main() {
    /* listOf只读 mutableListOf可读写  */

    // + 运算符和 - 运算符
    val list = listOf(1, 2, 3)
    val set = setOf(1, 2, 3)
    val map = mapOf(1 to "a", 2 to "b")
    println(list + 4)
    println(list - 3)

    val list2 = mutableListOf(1, 2, 3)
    val set2 = mutableSetOf(1, 2, 3)
    val map2 = mutableMapOf(1 to "a", 2 to "b")

    val colors = listOf("red", "green", "blue")
    val animals = listOf("dog", "cat", "bird")

    //mapping, zip
    println("mapping, zip")
    println(colors.map { it.uppercase() })
    println(colors zip animals)
    println(colors.zip(animals) { color, animal -> "The $animal is $color." })

    //pair, unzip, union
    println("pair, unzip, union")
    val numbersPair = listOf(1 to "one", 2 to "two", 3 to "three")
    println(numbersPair)
    // 分割list
    println(numbersPair.unzip())
    println(numbersPair.union(listOf(5 to "five", 6 to "six", 7 to "seven")))

    //associate
    println("associate")
    println(colors.associateWith { it.length })
    println(colors.associateBy { it.length })
    println(colors.associateBy(keySelector = { it.first().uppercaseChar() }, valueTransform = { it.length }))

    //filter
    println("filter")
    println(colors.filter { it.startsWith("b") })

    //grouping
    println("grouping")
    println(colors.groupBy { it.first().uppercaseChar() })
    println(colors.groupBy(keySelector = { it.first() }, valueTransform = { it.uppercase() }))

    //slice
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println("slice")
    println(numbers.slice(3..5))
    println(numbers.slice(0..5 step 2))
    println(numbers.slice(setOf(1, 3, 5)))

    //take, drop
    println("take")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.takeWhile { it.startsWith('o') })
    println("drop")
    println(numbers.drop(3))
    println(numbers.dropLast(3))
    println(numbers.dropWhile { it.startsWith('o') })

    //chunking
    println("chunking")
    println(numbers.chunked(2))
    println(numbers.chunked(3) { it.first() })

    //windowing
    println("windowing")
    println(numbers.windowed(3))
    println(numbers.windowed(2, step = 2))
}