package chap03


import joins.joinToString
import joins.joinToStringPackage


var opCount = 0

fun main(args: Array<String>) {
/*
    first()
    second()
    thrid()
    performOperation()
    reportOperationCount()

    // 확장 함수 사용
    println("Kotlin".lastChar())
    println("Kotlin".last())

    foruth()
    println(listOf("One", "Two", "Three", "Four").join(" "))

    //확장 프로퍼티 사용
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

 */
    val argsArray = arrayOf("one", "two", "three")
    fifth(argsArray)

    sixth()

    seventh()
    eighth()

    ninth()
    tenth()
}

fun tenth() {
    saveUser(User(1, "", ""))
}

fun ninth() {
    val kotlinLogo  = """|//
.| //
.|/ \\"""
    println(kotlinLogo.trimMargin())
}

fun eighth() {

    fun parsePath(path: String) {
        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")
        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        println("Dir: $directory, name: $fileName, ext: $extension")
    }

    parsePath("/Users/mygithub/kotiln-study/chap03/study.md")

    fun parsePathReg(path: String) {
        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if (matchResult != null) {
            val (directory, fileName, extension) = matchResult.destructured
            println("Dir: $directory, name: $fileName, ext: $extension")
        }
    }
    parsePathReg("/Users/mygithub/kotiln-study/chap03/study.md")
}

fun seventh() {
    println("12.345-6.A".split("\\.|-".toRegex())) //정규식을 명시적으로 만든다.

    println("12.345-6.A".split(".","-")) // 여러 구문 문자열을 지정한다.

    println("12.345-6.A".split('.','-')) // 여러 구문 문자열을 지정한다.
}

fun sixth() {
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val (number, name)  = 1 to "one"

    val list = listOf("one", "two", "three")
    for((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}

fun fifth(args: Array<String>) {
    val list = listOf("args: ", *args) //스프레드 연산자가 배열의 내용을 펼쳐준다.
    println(list)
}

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun foruth() {
    var list = listOf(1, 2, 3, 4)

    println(list.joinToString(separator=": ", prefix = "|", postfix = "|" ))

    val array = arrayListOf(1,2,3)
    println(array.joinToString(" "))
}

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation performed $opCount times")
}


fun thrid() {
    val list = listOf(1,2,3)
    val result = joinToString(list, "; ", "(", ")")

    println(result)
    println(joinToString(list,  separator= "; ", prefix="(", postfix =")" ))
    println(joinToStringDefault(list))

    println(joinToStringDefault(list, ": "))
    println(joinToStringDefault(list, prefix="{", postfix ="}" ))

    println(joinToStringPackage(list, ", ", "[", "]" ))
}

/**
 * 기본함수에 디폴트 파라미터
 */
fun<T> joinToStringDefault(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "(",
        postfix: String = ")"
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 * 기본 함수
 */
fun<T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun second() {
    val list = listOf(1, 2, 3)
    println(list)
}



fun first() {
    val set = hashSetOf(1, 7, 53, 7)
    println(set)
    val list = arrayListOf(1, 7, 53, 7)
    println(list)
    val map = hashMapOf(1 to "One", 7 to "Seven", 53 to "fifty-three",  7 to "Seven")
    println(map)

    println(set.javaClass) // 자바 getClass()
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf("first","second","third")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 14, 5)
    println(numbers.max())
}
