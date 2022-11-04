fun main(args: Array<String>) {
    var man = Man("Steve")
    man.display()

}

class Man(var name: String) {
   fun display() {
       println("The name of the person is $name")
   }
}