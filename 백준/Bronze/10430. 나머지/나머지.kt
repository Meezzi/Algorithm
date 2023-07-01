import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val num1 = Integer.parseInt(st.nextToken())
    val num2 = Integer.parseInt(st.nextToken())
    val num3 = Integer.parseInt(st.nextToken())

    println(firstCal(num1, num2, num3))
    println(secondCal(num1, num2, num3))
    println(thirdCal(num1, num2, num3))
    println(fourthCal(num1, num2, num3))
}

fun firstCal(a : Int, b : Int, c : Int) : Int = (a+b)%c

fun secondCal(a : Int, b : Int, c : Int) : Int = ((a%c) + (b%c))%c

fun thirdCal(a : Int, b : Int, c : Int) : Int = (a*b)%c

fun fourthCal(a : Int, b : Int, c : Int) : Int = ((a%c) * (b%c))%c
