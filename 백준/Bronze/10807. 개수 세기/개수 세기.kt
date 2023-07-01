import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = Integer.parseInt(br.readLine());
    val intArray = IntArray(n)

    val st = StringTokenizer(br.readLine())
    for (i in 0 until n) {
        intArray[i] = Integer.parseInt(st.nextToken())
    }

    val v = Integer.parseInt(br.readLine())
    println(countNumber(intArray, v))
}

fun countNumber(arr: IntArray, v: Int): Int {
    var cnt = 0
    for (i in arr) {
        if (i == v) cnt++;
    }
    return cnt
}
