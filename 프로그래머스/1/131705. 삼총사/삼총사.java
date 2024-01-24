import java.util.Arrays;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        Arrays.sort(number);
        if(number[0] > 0) return 0;
        
        for(int i = 0; i < number.length - 2; i++) {
            for(int j = i + 1; j < number.length - 1; j++) {
                for(int k = j + 1; k < number.length; k++) {
                   if(number[i] + number[j] == number[k] * (-1)) answer++;
                }
            }
        }
        
        return answer;
    }
}