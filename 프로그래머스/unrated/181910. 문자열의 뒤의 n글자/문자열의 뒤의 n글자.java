class Solution {
    public String solution(String my_string, int n) {
        
        String res = "";
        for(int i=my_string.length()-n; i<my_string.length(); i++) {
            res += my_string.charAt(i);
        }
        return res;
    }
}