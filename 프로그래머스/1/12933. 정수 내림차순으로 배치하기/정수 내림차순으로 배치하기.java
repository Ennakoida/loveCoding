import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] str = String.valueOf(n).split("");
        String nStr = "";
        Arrays.sort(str);
        
        for(int i = str.length - 1; i >= 0; i--) {
            nStr += str[i];
        }
        
        return Long.parseLong(nStr);
    }
}