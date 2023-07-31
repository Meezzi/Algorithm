fun main(args: Array<String>) {
    val num = readln().toInt()
    for (i in 0 until num) {
        val (zero, one) = fibonacci(readln().toInt())
        println("$zero $one")
    }
}

fun fibonacci(num: Int): Pair<Int, Int> {
    if (num == 0) return Pair(1, 0)
    else if (num == 1) return Pair(0, 1)

    var current = Pair(0, 1)
    for (i in 2 .. num) {
        val tmp = current
        current = Pair(current.second, current.first + current.second)
    }
    return current
}