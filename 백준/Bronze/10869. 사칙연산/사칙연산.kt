import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val num1 = Integer.parseInt(st.nextToken())
    val num2 = Integer.parseInt(st.nextToken())

    println(addTwoNumber(num1, num2))
    println(subTwoNumber(num1, num2))
    println(mulTwoNumber(num1, num2))
    println(divTwoNumber(num1, num2))
    println(remTwoNumber(num1, num2))
}

fun addTwoNumber(num1 : Int, num2 : Int) : Int = num1+num2

fun subTwoNumber(num1 : Int, num2 : Int) : Int = num1- num2

fun mulTwoNumber(num1 : Int, num2 : Int) : Int = num1*num2

fun divTwoNumber(num1 : Int, num2 : Int) : Int = num1/num2

fun remTwoNumber(num1 : Int, num2 : Int) : Int = num1%num2