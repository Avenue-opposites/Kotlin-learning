package base.oop

fun main() {
    /*
    Kotlin中的枚举类(enum class)与Java中的枚举类型类似,主要作用是定义一个类的对象可以有一系列预定义的常量值。
    枚举类有以下主要特征:
        1.使用enum关键字定义枚举类
        2.枚举类中的每个枚举常量用逗号分隔
        3.枚举类可以定义构造方法和成员函数
        4.可以实现接口
        5.可以在初始化块中初始化
    */

    val color = Color.GREEN
    val direction = Direction.WEST
    println(color.rgb)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);
    // 判断当前枚举常量是否包含红色。
    fun containsRed() = (rgb and RED.rgb != 0)
}

enum class Direction {
    EAST,
    SOUTH,
    WEST,
    NORTH
}