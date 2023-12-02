import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        int[] copyEmer = Arrays.copyOf(emergency, length);
        Arrays.sort(copyEmer);
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(emergency[i] == copyEmer[j]) {
                    answer[i] = length - j;
                    break;
                }
            }
        }        
        
        return answer;
    }
}