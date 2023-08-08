package base.oop

fun main() {
    // 在Kotlin中,范型(Generics)允许类、函数及接口在定义时不指定类型,在使用时再指定类型。这提供了重要的灵活性。
    // CatSpeak 可以赋值给 Speak<Animal>
    val birdSpeak: Speak<Animal> = BirdSpeak()
    // AnimalFeed 可以赋值给 Feed<Cat>
    val animalFeed: Feed<Dog> = AnimalFeed()
    println(birdSpeak.getAnimal().name)
    animalFeed.feed(Dog("mm"))
}

// Animal类及其子类
open class Animal(val name: String)
class Bird(name: String): Animal(name)
class Dog(name: String): Animal(name)

// 协变示例 - 返回值位置使用 out
interface Speak<out T> {
    fun getAnimal(): T
}

class BirdSpeak: Speak<Bird> {
    override fun getAnimal(): Bird {
        return Bird("Mimi")
    }
}

// 逆变示例 - 参数位置使用 in
interface Feed<in T> {
    fun feed(animal: T)
}

class AnimalFeed: Feed<Animal> {
    override fun feed(animal: Animal) {
        println("Feeding ${animal.name}")
    }
}