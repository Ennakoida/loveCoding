import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num : array) {
            String arrStr = String.valueOf(num);
            for(char arrChar : arrStr.toCharArray()) {
                if(arrChar == '7') answer++;
            }
        }
        
        return answer;
    }
}