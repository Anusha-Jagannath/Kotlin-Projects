package oct23

fun main(args: Array<String>) {

}

class Human {

    var age: Int = 0
    get() {
        println("The age is $field") //backing field
        return field
    }

    set(value) {
        if (value > 0) {
           field = value
        }
    }
}

//Backing field is used to store the value of its own property