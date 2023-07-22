class Solution {
    fun solution(myString: String, overwriteString: String, s: Int): String {
        val sb = StringBuilder(myString)
        for (index in overwriteString.indices) {
            val targetIndex = s + index
            if (targetIndex < myString.length) {
                sb.setCharAt(targetIndex, overwriteString[index])
            } else {
                sb.append(overwriteString[index])
            }
        }
        return sb.toString()
    }
}