class Solution {
    boolean solution(String s) {
        int open = 0, close = 0;

        if(s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(' ) return false;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else if (s.charAt(i) == ')') {
                close++;
            }
            if (open < close) {
                return false;
            }
        }
        if (open == close) {
            return true;
        }
        
        return false;
    }
}