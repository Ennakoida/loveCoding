import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                arr.add(numlist[i]);
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);   
        }
        
        return answer;
    }
}