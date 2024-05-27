package creationalpattern.factorymethod
// static factory method

fun main() {
    //normal way to create instant, Can not create
//    val server = Server(8800)

    //static factory method
    val server1 = Server.withPort(8080)
}

// restrict object instantiation by class
class Server private constructor(port: Long){
    init {
        println("Server started on port $port")
    }

    companion object{
        fun withPort(port: Long) = Server(port)
    }
}