import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val num1 = Integer.parseInt(st.nextToken())
    val num2 = Integer.parseInt(st.nextToken())

    println(subTwoNumber(num1, num2))
}

fun subTwoNumber(num1 : Int, num2 : Int) : Int{
    return num1 - num2
}