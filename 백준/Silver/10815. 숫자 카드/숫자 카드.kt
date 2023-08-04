fun main() {
    val n = readLine()!!.toInt()
    val cards = readLine()!!.split(" ").map { it.toInt() }.groupingBy { it }.eachCount()

    val m = readLine()!!.toInt()
    val targets = readLine()!!.split(" ").map { it.toInt() }

    for (target in targets) {
        print("${cards[target] ?: 0} ")
    }
}
