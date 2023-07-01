import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val num1 = Integer.parseInt(br.readLine())
    val num2 = Integer.parseInt(br.readLine())

    println(firstCal(num1, num2))
    println(secondCal(num1, num2))
    println(thirdCal(num1, num2))
    println(fourthCal(num1, num2))
}

fun firstCal(a : Int, b : Int) : Int = a*(b%10)

fun secondCal(a : Int, b : Int) : Int = a*((b/10)%10)

fun thirdCal(a : Int, b : Int) : Int = a*(b/100)

fun fourthCal(a : Int, b : Int) : Int = firstCal(a, b) + secondCal(a, b)*10 + thirdCal(a, b)*100
