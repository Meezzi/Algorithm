class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var sum = 0
        for (number in numbers) {
            if (sum > n) return sum
            sum += number
        }
        return sum
    }
}