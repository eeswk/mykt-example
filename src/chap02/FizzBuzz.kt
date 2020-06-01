package chap02

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun fact(i: Int) {


}

fun main() {

    for(i in 5 downTo 1) {
        i * i
        println(i*i)
    }


/*
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    /*
    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }
    */
    for (i in 1 until 10) {
        print(fizzBuzz(i))
    }

 */
}