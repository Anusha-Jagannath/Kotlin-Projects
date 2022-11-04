package sep21

fun main(args: Array<String>) {

    var user1 = User("Sam",10)
    var user2 = User("Sam",10)
    if (user1 == user2) {
        println("Both the users are equal")
        println(user1)
    }
    else {
        println("Both the users are not equal")
        println(user1.toString())
    }

    var newUser = user1.copy(name = "p",id = 24)
    println(newUser)
    println(user1)
}

data class User(var name: String, var id: Int) {

}