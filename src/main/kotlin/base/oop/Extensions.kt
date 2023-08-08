package base.oop

fun main() {
    /*
    在Kotlin中,扩展(Extensions)是一种非常实用的语言特性,它可以无需继承或修改原类的情况下扩展类的新功能。
    主要有6种扩展:
        1.扩展函数
            使用扩展函数可以为已有类添加新的函数
        2.扩展属性
            使用扩展属性可以添加新的属性
        3.将扩展声明为成员函数
        4.伴生对象扩展
        5.扩展范围
        6.扩展是静态解析的
    扩展一般声明在顶层
    */

    Ext().bar()
    println(Ext().name)
    Ext.a()
    println(Ext.b)

    val listS = listOf("A", "B", "C")
    listS.ext.foo()

    val listI = listOf(1, 2, 3)
    //listI.ext.foo() error
}

//扩展函数
fun Ext.bar() = println("bar")

//扩展属性
val Ext.name: String
    get() = "Ext"

//伴生对象扩展
fun Ext.Companion.a() = println("a")
val Ext.Companion.b: String
    get() = "b"

//扩展范围,只有在字符串列表中才能使用扩展
val List<String>.ext: Ext
    get() = Ext()
class Ext {
    //将扩展声明为成员函数
    private fun C.foobar() = println("foobar")
    fun foo() {
        println("foo")
    }
    fun foobar() = C().foobar()
    companion object {}
}

class C {
    fun print() = "C"
}