package june8

fun main(args: Array<String>) {
    var user1 = Person("sam",10)
    var user2 = Person("sam",10)

    println(user1)
    println(user2)

    if(user1 == user2) {
        print("equals")
    }
    else {
        print("not equals")
    }

    var newUser = user1.copy()
    println(newUser)
}

data class Person(var name: String,var id: Int) {

}