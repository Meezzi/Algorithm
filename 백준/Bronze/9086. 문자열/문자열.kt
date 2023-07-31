fun main(args: Array<String>) {
    val num = readln().toInt()
    for(i in 0 until num) {
        val string = readln()
        println("${string.first()}${string.last()}")
    }
}