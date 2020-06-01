package chap02

import java.lang.Exception

enum class Color {
    RED, ORANGE, YELLOW, BLUE, VIOLET
}

enum class Rgb (
    val r: Int, var g: Int, var b: Int
) {
    RED(255,0, 0),
    ORANGE(255, 165,0),
    YELLOW(255, 255, 0),
    BULE(0,0, 255),
    GREEN(0, 255, 0),
    INDIGO(75,0,130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(rgb: Rgb) =
        when(rgb) {
            Rgb.RED -> "Richard"
            Rgb.ORANGE -> "Of"
            Rgb.YELLOW -> "York"
            Rgb.GREEN -> "Gave"
            Rgb.BULE -> "Battle"
            Rgb.INDIGO -> "In"
            Rgb.VIOLET -> "Vain"
        }
fun getWarmth(rgb: Rgb) =
    when(rgb) {
        Rgb.RED, Rgb.ORANGE, Rgb.YELLOW -> "warm"
        Rgb.GREEN -> "neutral"
        Rgb.BULE, Rgb.INDIGO, Rgb.VIOLET -> "cold"
    }

fun mix(r1: Rgb, r2: Rgb) =
    when(setOf(r1, r2)) {
        setOf(Rgb.RED, Rgb.YELLOW) -> Rgb.ORANGE
        setOf(Rgb.YELLOW, Rgb.BULE) -> Rgb.GREEN
        setOf(Rgb.BULE, Rgb.VIOLET) -> Rgb.INDIGO
        else -> throw Exception("Dirty color")
    }

fun mixOptimized(r1: Rgb, r2: Rgb) =
        when {
            (r1 == Rgb.RED && r2==Rgb.YELLOW) || (r1 == Rgb.YELLOW && r2 == Rgb.RED) -> Rgb.ORANGE
            (r1 == Rgb.YELLOW && r2==Rgb.BULE) || (r1 == Rgb.BULE && r2 == Rgb.YELLOW) -> Rgb.GREEN
            (r1 == Rgb.BULE && r2==Rgb.VIOLET) || (r1 == Rgb.VIOLET && r2 == Rgb.BULE) -> Rgb.INDIGO
            else -> throw Exception("Dirty color")
        }


fun main() {
    println(Rgb.BULE.rgb())
    println(getMnemonic(Rgb.RED))
    println(getWarmth(Rgb.VIOLET))
    println(mix(Rgb.BULE, Rgb.YELLOW))
    println(mixOptimized(Rgb.RED, Rgb.YELLOW))
    println(mixOptimized(Rgb.YELLOW, Rgb.RED))
    println(mixOptimized(Rgb.RED, Rgb.RED))
}