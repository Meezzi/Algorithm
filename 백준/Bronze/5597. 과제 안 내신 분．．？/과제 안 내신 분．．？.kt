import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var attendance = BooleanArray(30)

    for(i in 1 .. 28) {
        attendance[br.readLine().toInt()-1] = true
    }

    for(i in attendance.indices) {
        if(!attendance[i]) println(i+1)
    }


}