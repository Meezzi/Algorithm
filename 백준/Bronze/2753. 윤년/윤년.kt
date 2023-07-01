import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val year: Int = Integer.parseInt(br.readLine())

    println(leapYearCal(year))
}

fun leapYearCal(year: Int): Int =
    if (year % 4 == 0) {
        if (year % 100 != 0) 1
        else if (year%400==0) 1
        else 0
    } else 0
