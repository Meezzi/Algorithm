class Solution {
    fun solution(s: String): IntArray {
        val map = mutableMapOf<Char, Int>()
        val result = IntArray(s.length) { -1 }

        for (index in s.indices) {
            if (map.contains(s[index])) {
            result[index] = index - map[s[index]]!!
            }
            map[s[index]] = index
        }
    return result
    }
}