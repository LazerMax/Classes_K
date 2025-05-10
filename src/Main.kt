// -----Задание 1-----
class Words {
    init {
        println("Класс Words был создан! Для задания № 1")
    }
}

// -----Задание 2-----
class Message(private val name: String) {
    fun introduce() {
        println("Привет, меня зовут $name")
    }
}

// -----Задание 3-----
open class Animal(
    open val food: String,
    open val location: String)
{
    open fun makeNoise() {
        println("Животное спит")
    }

    open fun eat() {
        println("Животное ест $food")
    }

    fun sleep() {
        println("Животное спит")
    }
}

class Dog(
    override val food: String,
    override val location: String,
    val poroda: String
) : Animal(food, location) {
    override fun makeNoise() {
        println("Собака лает: Гав-гав!")
    }

    override fun eat() {
        println("Собака ест $food")
    }
}

class Cat(
    override val food: String,
    override val location: String,
    val wild_or_not: Boolean
) : Animal(food, location) {
    override fun makeNoise() {
        println("Кошка мурлычет: Мяу-мяу!")
    }

    override fun eat() {
        println("Кошка ест $food")
    }
}

class Horse(
    override val food: String,
    override val location: String,
    val maxSpeed: Int
) : Animal(food, location) {
    override fun makeNoise() {
        println("Лошадь ржёт: И-го-го!")
    }

    override fun eat() {
        println("Лошадь ест $food")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Еда: ${animal.food}, Местоположение: ${animal.location}")
    }
}

fun main() {
    // Задание 1
    println("-----Задание 1-----")

    val words1 = Words()
    val words2 = Words()

    // Задание 2
    println()
    println("-----Задание 2-----")

    val name1 = Message("Антон")
    name1.introduce()

    val name2 = Message("Игорь")
    name2.introduce()

    // Задание 3
    println()
    println("-----Задание 3-----")

    val animals = arrayOf(
        Dog("кости", "вальер", "лабрадор"),
        Cat("молоко", "дом", true),
        Horse("сено", "поле", 60)
    )

    val vet = Veterinarian()

    for (animal in animals) {
        vet.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        println()
    }

}