package chap03

open class View {
    open fun click() = println("View Clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view:View = Button()
    view.click()

    view.showOff()
}

