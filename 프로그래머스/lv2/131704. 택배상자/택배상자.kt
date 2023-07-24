import java.util.Stack

class Solution {
    fun solution(order: IntArray): Int {
        val stack = Stack<Int>()
        var answer = 0
        var max = 0

        for (box in order) {
            while (max < box) {
                max++
                stack.push(max)
            }

            if (stack.isNotEmpty() && stack.peek() == box) {
                stack.pop()
                answer++
            } else return answer
        }
        return answer
    }
}