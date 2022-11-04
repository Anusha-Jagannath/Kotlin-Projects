package sept14

fun main(args: Array<String>) {
   var myButton = Button()
    myButton.onTouch()
    myButton.onClick()
}

interface MyInterfaceListener {
    var name: String

    fun onTouch()
    fun onClick() {
        println("on click interface code: Button clicked")
    }
}

interface MySecondInterface {

    fun onTouch() {
        println("MySecondInterface: onTouch")
    }
    fun onClick() {
        println("on click interface code: Button clicked")
    }
}

class Button: MyInterfaceListener, MySecondInterface {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun onTouch() {
        super<MyInterfaceListener>.onClick()
        println("Touch is invoked")
    }

    override fun onClick() {
        println("Button was clicked")
    }
}