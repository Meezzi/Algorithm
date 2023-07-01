import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    println(printBlowingYear(Integer.parseInt(br.readLine())))
}

fun printBlowingYear(year : Int) : Int = year-543
