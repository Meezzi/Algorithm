// 문자열을 순회한다.
// 각 문자열의 인덱스와 needle을 비교하여
// 일치하는 문자열의 첫 번째 인덱스를 반환한다.

class Solution {
  int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }
}