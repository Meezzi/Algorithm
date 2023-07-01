import java.io.*
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val num1 = BigInteger(st.nextToken())
    val num2 = BigInteger(st.nextToken())
    val num3 = BigInteger(st.nextToken())

    println(addThreeNum(num1, num2, num3))
}

fun addThreeNum(a: BigInteger, b: BigInteger, c: BigInteger) : BigInteger = a.plus(b.plus(c))

