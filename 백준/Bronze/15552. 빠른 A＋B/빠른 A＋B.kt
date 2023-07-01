import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var t = Integer.parseInt(br.readLine())

    for(i in 0 until t) {
        val st = StringTokenizer(br.readLine())
        var n1 = Integer.parseInt(st.nextToken())
        var n2 = Integer.parseInt(st.nextToken())
        bw.write(addTwoNumbers(n1, n2).toString() + "\n")
    }

    bw.flush()
    bw.close()
}

fun addTwoNumbers(n1: Int, n2: Int): Int = n1 + n2

