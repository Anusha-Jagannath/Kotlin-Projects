fun main(args: Array<String>) {

    var user1 = User("Ram",10)
    var user2 = User("Ram",10)
    println(user1)
    println(user2)

    if(user1 == user2){
        println("users are equal")
    }
    else {
        println("users are not equal")
    }
}

data class User(var name:String,var id:Int){

}