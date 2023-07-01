import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val h = Integer.parseInt(st.nextToken())
    val m = Integer.parseInt(st.nextToken())

    setAlarm(h, m)
}

fun setAlarm(h: Int, m: Int) {
    var minute = m;
    var hour = h;
    if (minute < 45) {
        minute +=15
        hour-=1
    } else minute -= 45

    if(hour==-1) hour = 23

    println("$hour $minute")
}
