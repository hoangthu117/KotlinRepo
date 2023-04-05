package DataClass

fun main() {
    val person1 = Person("John", 30)
    val person2 = Person("John", 30)
    val person3 = Person("Jane", 25)

    println(person1) // In ra: Person(name=John, age=30)
    println(person1 == person2) // In ra: true
    println(person1 == person3) // In ra: false

    val person4 = person1.copy(age = 35)
    println(person4) // In ra: Person(name=John, age=35)
}
