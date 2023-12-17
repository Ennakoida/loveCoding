import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] avg = new int[numlist.length][2];
        
        int i = 0;
        for(int num : numlist) {
            avg[i][0] = num;
            avg[i][1] = Math.abs(num - n);
            i++;
        }
        
        Arrays.sort(avg, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o2[0], o1[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        
        for(int j = 0; j < avg.length; j++) {
            answer[j] = avg[j][0];
        }
        
        return answer;
    }
}