package chap03


fun String.lastChar():Char = this.get(this.length - 1)

fun View.showOff() = println("view!!")

fun Button.showOff() = kotlin.io.println("Button!!")

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length-1, value)
    }

