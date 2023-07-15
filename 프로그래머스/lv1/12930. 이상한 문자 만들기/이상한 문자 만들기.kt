class Solution {
    fun solution(s: String) =
        s.split(" ").joinToString(" ") { word ->
            word
                .mapIndexed{ index, char ->
                    if ( index % 2 == 0) char.toUpperCase() else char.toLowerCase()
                }
                .joinToString("")
        }
}