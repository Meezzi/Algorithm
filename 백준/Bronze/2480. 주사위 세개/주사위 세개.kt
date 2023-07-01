import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    var d1 = Integer.parseInt(st.nextToken())
    var d2 = Integer.parseInt(st.nextToken())
    var d3 = Integer.parseInt(st.nextToken())

    println(getReward(d1, d2, d3))
}

fun getReward(d1: Int, d2: Int, d3: Int): Int {
    if (d1 == d2 && d2 == d3) return d1 * 1000 + 10000
    else if (d1 == d2 || d1==d3) return d1 * 100 + 1000
    else if (d2 == d3) return d2 * 100 + 1000
    else return d1.coerceAtLeast(d2.coerceAtLeast(d3)) * 100
}

