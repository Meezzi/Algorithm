import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    var h = Integer.parseInt(st.nextToken())
    var m = Integer.parseInt(st.nextToken())
    var t = Integer.parseInt(br.readLine())

    setOven(h, m, t)
}

fun setOven(h: Int, m: Int, t: Int) {
    var minute = m + t
    var hour = h

    if(minute >= 60) {
        hour += minute / 60
        minute %= 60
    }

    if(hour >= 24) {
        hour -= 24
    }

    print("$hour $minute")
}
