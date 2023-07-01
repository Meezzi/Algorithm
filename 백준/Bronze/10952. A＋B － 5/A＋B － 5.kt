import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val st = StringTokenizer(br.readLine())
        val n1 = Integer.parseInt(st.nextToken())
        val n2 = Integer.parseInt(st.nextToken())

        if (n1 == 0 && n2 == 0) return
        else println(addTwoNumber(n1, n2))
    }
}

fun addTwoNumber(n1: Int, n2: Int): Int = n1 + n2

