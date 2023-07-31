var fibo = mutableMapOf<Int, Pair<Int, Int>>() 
fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    for (i in 0 until num) {
        val tmp = readLine()!!.toInt()
        fibonacci(tmp)
        if (tmp == 0) println("1 0") 
        else if (tmp == 1) println("0 1") 
        else println("${fibo[tmp]?.first} ${fibo[tmp]?.second}")
    }
}

fun fibonacci(num: Int): Pair<Int, Int> { 
    if (num == 0) return Pair(1, 0) 
    if (num == 1) return Pair(0, 1) 

    if (fibo.containsKey(num)) {
        return fibo[num]!!
    } else {
        val fibNMinus1 = fibonacci(num - 1)
        val fibNMinus2 = fibonacci(num - 2)
        val result = Pair(fibNMinus1.first + fibNMinus2.first, fibNMinus1.second + fibNMinus2.second)
        fibo[num] = result
        return result
    }
}
