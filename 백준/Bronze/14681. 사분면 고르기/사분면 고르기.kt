import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val x = Integer.parseInt(br.readLine())
    val y = Integer.parseInt(br.readLine())

    println(quadrantCal(x, y))
}

fun quadrantCal(x: Int, y: Int): Int =
    when {
        x > 0 && y > 0 -> 1
        x > 0 && y < 0 -> 4
        x < 0 && y > 0 -> 2
        x < 0 && y < 0 -> 3
        else -> {0}
    }
