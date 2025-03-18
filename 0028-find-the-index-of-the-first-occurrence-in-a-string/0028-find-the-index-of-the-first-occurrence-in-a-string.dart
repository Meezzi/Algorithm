// 1. indexOf : 해당값이 있으면 인덱스를 반환하고 없으면 -1를 반환

// class Solution {
//   int strStr(String haystack, String needle) {
//     return haystack.indexOf(needle);
//   }
// }

// 2. 문자열 순회
// 문자열을 순회하면서 needle과 같은 문자열을 찾는다.
// 비교하는 문자열은 substring으로 문자열을 나눈 후, 비교한다.
// str.substring(i, j) : 문자열을 i번째부터 j-1번째까지 나눈다.

// 여기서 실수한 점은 substring으로 문자열을 나눌 때
// 순회할 수록 마지막 인자값도 증가해야하는데 needle.length로 고정시켜버리는 바람에
// RangeError가 발생했다.
class Solution {
  int strStr(String haystack, String needle) {
    for (int i = 0; i < haystack.length - needle.length + 1; i++) {
      if(haystack.substring(i, i + needle.length) == needle) {
        return i;
      }
    }
    return -1;
  }
}