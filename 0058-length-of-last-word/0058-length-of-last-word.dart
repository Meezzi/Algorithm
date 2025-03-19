class Solution {
  int lengthOfLastWord(String s) {
    var str = s.split(' ').where((x) => x.trim().isNotEmpty).toList();
    return str[str.length - 1].length;
  }
}