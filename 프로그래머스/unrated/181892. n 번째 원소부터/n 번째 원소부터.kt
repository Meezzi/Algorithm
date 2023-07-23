class Solution {
    fun solution(numList: IntArray, num: Int): List<Int> {
        return numList.filterIndexed { index, item -> index + 1 >= num }
    }
}