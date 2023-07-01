import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var num = Integer.parseInt(br.readLine())

    for(i in 1..num) {
        var st = StringTokenizer(br.readLine())
        var n1 = Integer.parseInt(st.nextToken())
        var n2 = Integer.parseInt(st.nextToken())
        println(addTwoNumber(n1, n2))
    }
}

fun addTwoNumber(n1 : Int, n2 : Int) = n1 + n2

