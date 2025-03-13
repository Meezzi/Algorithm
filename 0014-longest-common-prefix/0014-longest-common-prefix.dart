class Solution {
  String longestCommonPrefix(List<String> strs) {
    
    if(strs.isEmpty) return '';
    
    String prefix = strs.first;

    for (int i = 1; i < strs.length; i++) {
      String str = strs[i];
      while(!str.startsWith(prefix)) {
        prefix = prefix.substring(0, prefix.length - 1);
      }
      
      if(prefix.isEmpty) {
        return '';
      }
    }
    
    return prefix;
  }
}

// 입력 : ["flower", "flow", "flight"]

// 초기 비교값 : flower

// 첫 번째 비교 : flow가 flower로 시작하는지?
// => flow가 flowe로 시작하는지?
// => flow가 flow로 시작하는지?

// 다음 비교 : flight가 flow로 시작하는지?
// => flight가 flo로 시작하는지
// => flight가 fl로 시작하는지?

// startsWith와 codeUnits 비교