open class Welcome {
    fun sayHello():Unit{
        System.out.print("hello world");
    }
}

fun main(args: Array<String>) {
    var welcome = Welcome()
    welcome.sayHello()
}