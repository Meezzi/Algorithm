class Solution {
  int lengthOfLastWord(String s) {
    var splitString = s.trim().split(' ');
    return splitString.last.length;
  }
}