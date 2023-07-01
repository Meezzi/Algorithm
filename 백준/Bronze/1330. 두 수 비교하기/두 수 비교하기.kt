import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val a : Int = Integer.parseInt(st.nextToken())
    val b : Int = Integer.parseInt(st.nextToken())

    println(compareTwoNumber(a, b))
}

fun compareTwoNumber(a : Int, b : Int) : String = if(a<b) "<" else if(a>b) ">" else "=="
