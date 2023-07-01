import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var byte = Integer.parseInt(br.readLine())

    println(byteCal(byte))
}

fun byteCal(byte: Int): String {

    var str: String = ""

    for (i in 1 until byte / 4) {
        str += "long "
    }
    return str + "long int"
}

