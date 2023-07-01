import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var num = Integer.parseInt(br.readLine())

    printMultiplicationTable(num)
}

fun printMultiplicationTable(num : Int) {
    for (i in 1..9) {
        println("$num * $i = ${num*i}")
    }
}

