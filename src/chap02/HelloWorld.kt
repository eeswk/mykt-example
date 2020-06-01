package chap02

fun main(args: Array<String>) {
    println("Hello, World")
    println(max(1, 2))
    println(max2(1, 2))
    println(max3(1, 2))


    val message : String
    if (canPerformOperation()) {
        message = "Success"
    } else {
        message = "Failure"
    }
    println(message)


    val languages = arrayListOf("Java") //불변참조
    languages.add("Kotlin") // 참조가 가리키는 객체 내부를 변경한다.

    var answer = 42
    //answer = "test" // type mismatch

    //문자열 템플릿
    var name = if (args.size > 0 ) args[0] else "Kotlin"
    println("Hello, $name!")

    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")

    class Person(val name: String)

    val person = Person("swan")
    println(person.name)
}


fun canPerformOperation(): Boolean = true

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a:Int, b:Int): Int = if (a > b) a else b

fun max3(a:Int, b:Int)  = if (a > b) a else b

