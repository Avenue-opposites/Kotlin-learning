package base

fun main() {
    /*
    在Kotlin中,懒加载(Lazy Initialization)是指将属性的初始化推迟到第一次使用时。主要通过lazy()函数来实现。
    lazy()接受一个 Lambda 表达式作为参数,该表达式返回类型为属性的类型,并包含初始化逻辑。
    lazy()会在第一次调用get()时执行传入的 Lambda 表达式并记录结果,后续调用get()会直接返回记录的结果,而不再执行 Lambda。
    lazy只支持val声明
    懒加载的主要优点:
        1.不必在创建对象时就完成全部初始化,可以推迟部分初始化逻辑到真正需要时再执行
        2.避免不必要的初始化,如果属性没有被使用,则其初始化表达式也不会执行
        3.初始化逻辑只执行一次,提高性能
    */
    fun loadData() = "Avenue opposites"

    val data: String by lazy {
        // 初始化逻辑
        loadData()
    }
    
    // 第一次调用
    println(data) // 执行初始化逻辑

    // 后续调用
    println(data) // 不再初始化,直接返回
}