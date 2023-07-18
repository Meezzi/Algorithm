fun main(args: Array<String>) {
    val a = readln().toInt()
    if (isOdd(a)) {
        println("$a is odd")
    } else println("$a is even")
}

fun isOdd(a: Int): Boolean {
    return a % 2 != 0
}