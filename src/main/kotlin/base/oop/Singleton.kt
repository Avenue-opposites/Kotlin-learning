package base.oop

fun main() {
    /*
    在Kotlin中可以通过以下几种方式实现单例:
        1.对象声明
        2.伴生对象
        3.lazy()延迟加载
        4.私有构造函数
    */
    ResourceLoader.loadResource()
}

object ResourceLoader {
    fun loadResource() {
        // ...
    }
}

/*class ResourceLoader {
    companion object {
        val instance = ResourceLoader()
    }
    fun loadResource() {
        // ...
    }
}*/

//val resourceLoader by lazy { ResourceLoader() }

//class ResourceLoader private constructor() {
//    companion object {
//        private lateinit var instance: ResourceLoader
//        fun getInstance() = instance ?: ResourceLoader().also { instance = it }
//    }
//}