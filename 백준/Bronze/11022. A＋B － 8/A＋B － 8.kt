import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var t = Integer.parseInt(br.readLine())

    for(i in 1 .. t) {
        val st = StringTokenizer(br.readLine())
        var n1 = Integer.parseInt(st.nextToken())
        var n2 = Integer.parseInt(st.nextToken())
        println(addTwoNumbers(n1, n2, i))
    }
}

fun addTwoNumbers(n1: Int, n2: Int, cnt: Int): String = "Case #$cnt: $n1 + $n2 = ${n1+n2}"

