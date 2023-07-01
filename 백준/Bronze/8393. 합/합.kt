import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var num = Integer.parseInt(br.readLine())

    println(addAllNumber(num))
}

fun addAllNumber(n1 : Int) : Int{
    var sum = 0
    for(i in 1.. n1) {
        sum+=i
    }

    return sum
}

