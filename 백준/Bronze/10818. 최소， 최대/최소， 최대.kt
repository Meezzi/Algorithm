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
    println(findMinMaxNumbers(intArray))


}

fun findMinMaxNumbers(arr: IntArray): String {
    var max = arr[0]
    var min = arr[0]

    for(i in arr.indices) {
        if(arr[i] > max) max = arr[i]
        if(arr[i] < min) min = arr[i]
    }

    return "$min $max"
}

