package chap04

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User { }

class SubscribingUser(val email: String): User {
    override val nickname: String
        get() = email.substringBefore('@') //커스텀 게터
}

class FacebookUser(val accountId: Int): User {
    override val nickname: String = getFacebookName(accountId)  //프로퍼티화 식 초기화

    fun getFacebookName(accountId: Int): String {
        when(accountId) {
            1 -> return "Good"
            else -> return "BAD"
        }
    }
}

interface Account {
    val email: String
    val nickname: String
        get() = email.substringBefore('@') //프로퍼티에 뒷받침하는 필드가 없다. 대신 매번 결과 계산을 돌려준다.

}

class BankAccount(override val email: String): Account {

}

fun main(args: Array<String>) {
    println(PrivateUser("test@naver.com").nickname)
    println(SubscribingUser("test@naver.com").nickname)
    println(SubscribingUser("test@naver.com").nickname)
    println(FacebookUser(1).nickname)
    println(FacebookUser(2).nickname)

    val bankAccount = BankAccount("frontierswan@naver.com")
    println(bankAccount.nickname)

}


