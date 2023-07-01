import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var totalMount = Integer.parseInt(br.readLine())
    var cnt = Integer.parseInt(br.readLine())

    var sum = 0

    for (i in 1..cnt) {
        val st = StringTokenizer(br.readLine())

        var itemPrice = Integer.parseInt(st.nextToken())
        var itemCnt = Integer.parseInt(st.nextToken())
        sum+=totalCal(itemPrice, itemCnt)
    }

    if(totalMount==sum) println("Yes")
    else println("No")
}

fun totalCal(item: Int, itemCnt: Int): Int = item * itemCnt

