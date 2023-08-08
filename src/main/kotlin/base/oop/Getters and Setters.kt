package base.oop

fun main() {
    /*
    在Kotlin中,field关键字代表属性备份字段。
    当属性声明时,Kotlin会自动生成一个备份字段保存属性值。field可以在属性的访问器(getter/setter)中访问这个备份字段。
    field主要用于以下场景:
        1.在自定义getter时访问备份字段值。
        2.在setter方法中修改备份字段值。
        3.当自定义setter参数名与属性同名时,使用field区分属性和参数。
    可以将field看作this.属性
    */

    val food = Food("apple", "red")

    println(food.color)
    food.color = "green"
    println(food.color)

}

class Food(name: String, color: String) {
    val name: String = name
        get() = "name = $field"
    var color: String = color
        get() = "color = $field"
        set(value) {
            println("field = $field, value = $value")
            field = value
        }
}