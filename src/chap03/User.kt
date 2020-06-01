package chap03

class User(val id: Int, val name: String, val address: String)

fun saveUser(user:User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }

    //User를 데이터베이스에 저장한다.
}

fun saveUserValid(user: User) {

    fun validate(user:User, value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty ${fieldName} ")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    //user를 데이터베이스 저장한다.
}

fun User.validateBeforesave() {
    fun validate(value:String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id : empty ${fieldName}") //User의 프로퍼티를 직접 사용.
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun userSaved(user: User) {
    user.validateBeforesave()
    //user를 저장한다.
}