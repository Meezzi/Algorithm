import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val score : Int = Integer.parseInt(br.readLine())

    println(scoreCal(score))
}

fun scoreCal(a : Int) : String =
    when (a) {
        in 90..100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        in 60 .. 69 -> "D"
        else -> "F"
    }
