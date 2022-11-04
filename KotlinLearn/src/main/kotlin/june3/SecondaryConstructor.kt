package june3

fun main(args: Array<String>) {
    var dog = Dog2("black","pug")
}

open class Animal2 {
    var color: String = ""
    constructor(color: String){
        this.color = color
        println("The Animal has got the color $color")
    }
}


class Dog2: Animal2 {

    var breed: String = " "
    constructor(color: String, breed:String): super(color) {
        this.breed = breed
        println("The dog has got the color $color and breed is $breed")
    }


}