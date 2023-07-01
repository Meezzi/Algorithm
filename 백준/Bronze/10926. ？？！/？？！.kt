import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    println(addMark(br.readLine()))


}

fun addMark(str : String) : String = "$str??!"
