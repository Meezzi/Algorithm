class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): ArrayList<Int> {
        val answer = arrayListOf<Int>()
        val map = mutableMapOf<String, Int>()
        for(index in name.indices) {
            map[name[index]] = yearning[index]
        }
        for(score in photo) {
            var sum = 0
            for(index in score.indices) {
                if (map.contains(score[index])) {
                    sum += map[score[index]]!!
                }
            }
            answer.add(sum)
        }
        return answer
    }
}