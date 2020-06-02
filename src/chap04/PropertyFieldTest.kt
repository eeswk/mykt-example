package chap04.propertyFieldTest

class User(val name: String) {
    var address: String = "unspecified"
        set(value:String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드 값 읽기
            field = value //뒷받침 하는 필드 값 변경
        }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrasse 47, 80687, Muenchen"
}