class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        return numbers.fold(0) { acc, i -> if (n >= acc) acc + i else acc}
    }
}