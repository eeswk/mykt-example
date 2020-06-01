package chap02

class Animal (
    val name: String,
    var isMale: Boolean
)

fun main() {
    val cat = Animal("cat", true)
    println(cat.name)
    println(cat.isMale)
    cat.isMale = false


    var house = House("gandnam", false)
    println(house.name)
    println(house.isApt)

    house.isApt = true
    println(house.isApt)

    var rectangle = Rectangle(40, 30)
    println(rectangle.isSquare)

}




