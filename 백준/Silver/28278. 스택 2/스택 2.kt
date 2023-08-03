import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    for (i in 0 until n) {
        val command = br.readLine().split(" ")

        when (command[0].toInt()) {
            1 -> {
                val x = command[1].toInt()
                stack.push(x)
            }
            2 -> {
                if (stack.isNotEmpty()) {
                    bw.write("${stack.pop()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            3 -> {
                bw.write("${stack.size}\n")
            }
            4 -> {
                if (stack.isEmpty()) {
                    bw.write("1\n")
                } else {
                    bw.write("0\n")
                }
            }
            5 -> {
                if (stack.isNotEmpty()) {
                    bw.write("${stack.peek()}\n")
                } else {
                    bw.write("-1\n")
                }
            }
        }
    }
    
    bw.flush()
    bw.close()
}
