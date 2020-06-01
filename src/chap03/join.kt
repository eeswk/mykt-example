package joins


/**
 * 확장 함수로 유틸리티 함수 정의
 */
fun<T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
):String {
    val result = StringBuffer(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

/**
 *
 */
fun<T> joinToStringPackage(
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