import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    var intArray = Array<Int>(n) { 0 }

    for(i in 0 until m) {
        val st = StringTokenizer(br.readLine())

        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()
        val c = st.nextToken().toInt()

        for(i in a .. b) {
            intArray[i-1] = c
        }
    }

    for(i in intArray) {
        print("$i ")
    }
}