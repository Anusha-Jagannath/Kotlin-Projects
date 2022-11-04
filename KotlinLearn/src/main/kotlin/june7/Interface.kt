package june7

fun main(args: Array<String>) {

    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
}
interface MyInterfaceListener {

     var name: String

     fun onTouch()
     fun onClick() {
         println("onClick interface: Button clicked")
     }
}

interface MyInterfaceListener2 {

    fun onTouch() {
        println("on touch was called from second interface")
    }
    fun onClick() {
        println("onClick interface: Button clicked from interface 2")
    }
}

class MyButton: MyInterfaceListener, MyInterfaceListener2 {
    override var name: String = "dummy_name"
    override fun onTouch() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        super<MyInterfaceListener2>.onClick()
    }

}