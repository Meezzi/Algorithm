import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var line: String?
    while (br.readLine().also { line = it } != null) {
        val st = StringTokenizer(line)
        val n1 = Integer.parseInt(st.nextToken())
        val n2 = Integer.parseInt(st.nextToken())
        val result = n1 + n2
        println(result)
    }
}
