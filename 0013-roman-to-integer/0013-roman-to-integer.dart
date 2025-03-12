class Solution {
  int romanToInt(String s) {

    Map<String, int> romanToIntMap = {
      'I': 1,
      'V': 5,
      'X': 10,
      'L': 50,
      'C': 100,
      'D': 500,
      'M': 1000,
    };

    var sum = 0;
    
    for (int i = 0; i < s.length; i++) {
      
      int currentValue = romanToIntMap[s[i]]!;

      int nextValue = i < s.length-1 ? romanToIntMap[s[i + 1]]! : 0;

      if (currentValue < nextValue) {
        sum += (nextValue - currentValue);
        i++;
      } else {
        sum += currentValue;
      }
      print(sum);
    }

    return sum;
  }
}