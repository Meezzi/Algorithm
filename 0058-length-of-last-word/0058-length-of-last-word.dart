class Solution {
  int lengthOfLastWord(String s) {
    String res = "";
    
    for (var i = s.length-1; i >=0; i--) {
      if(s[i]== " " && res.isNotEmpty) return res.length; 
      if(s[i] == " ") {
        continue;
      }
      res+= s[i];
    }

    return res.length;
  }
}