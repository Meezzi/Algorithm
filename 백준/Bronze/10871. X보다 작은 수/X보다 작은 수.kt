import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val n = Integer.parseInt(st.nextToken());
    val x = Integer.parseInt(st.nextToken());
    val intArray = IntArray(n)

    val numbers = br.readLine().split(" ")
        .map { it.toInt() }
        .filter { it < x }

    print(numbers.joinToString(" "))
}

