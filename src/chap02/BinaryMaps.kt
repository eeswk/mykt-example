package chap02

import java.io.BufferedReader
import java.io.StringReader
import java.util.*

fun main() {
    val binaryMaps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryMaps[c] = binary
       // binaryMaps.put(c, binary)
    }

    for ((letter, binary) in binaryMaps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11","1001")
    for ((index, element)in list.withIndex()) {
        println("$index: $element")
    }

    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

    println(isLetter('q'))
    println(isNotDigit('x'))

    fun recognize(c: Char) = when (c) {
        in 'a'..'z', in 'A'..'Z' -> "It's a letter"
        in '0'..'9' -> "It's a digit!"
        else -> "I don't know.."
    }

    println(recognize('8'))

    println("Kotlin" in "Java".."Scala")

    println("Kotlin" in setOf("Java","Scala"))

    val number = 100
    val percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("A number value must be between 0 and 100 : $number")

    if(percentage !in 0..100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100 : $percentage")
    }

    fun readNumber(reader: BufferedReader): Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            return null
        } finally {
            reader.close()
        }
    }

    val reader = BufferedReader(StringReader("999"))
    println(readNumber(reader))

    fun readNumberTry(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine()) //이 식의 값이 try 식의 값이 된다.
        } catch (e: NumberFormatException) {
            null
        }
        println(number)
    }
    var readerTry = BufferedReader(StringReader("not a number"))
    readNumberTry(readerTry) //아무것도 출력되지 않는다.


    //문제
    fun test(list2: Array<Int>) : Int {
        for (i in list2.size + 1 downTo 0 step 1) {
            if (i !in list2) {
                println(i)
                return i
            }
        }
        return 0
    }

    var result = test(arrayOf(6,2,3,4,5));
    println(result)

}

