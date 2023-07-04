import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var intArray = Array<Int>(30) { 0 }

    for(i in 1 .. 28) {
        intArray[br.readLine().toInt()-1] = 1
    }

    for(i in 0 until 30) {
        if(intArray[i] == 0) println(i+1)
    }


}