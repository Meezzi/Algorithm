import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var starCnt = Integer.parseInt(br.readLine())

    for(i in 1 .. starCnt) {
        printBlank(starCnt-i)
        printStars(i)
        println()
    }
}

fun printStars(star: Int) {
    for(i in 1.. star) print("*")
}

fun printBlank(blank: Int) {
    for(i in 1..blank)print(" ")
}

