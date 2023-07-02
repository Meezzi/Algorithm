import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val intArray = IntArray(9)

    for (i in 0 until 9) {
        intArray[i] = Integer.parseInt(br.readLine())
    }
    println(findMaxNumbers(intArray))


}

fun findMaxNumbers(arr: IntArray): String {
    var max = arr.max()
    var maxIndex = arr.indexOf(max) + 1

    return "$max\n$maxIndex"
}

