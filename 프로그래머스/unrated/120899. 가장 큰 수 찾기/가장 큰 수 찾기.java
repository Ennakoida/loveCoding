import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        
        for(int arr : array) {
            map.put(arr, index++);
        }
        
        answer[0] = Collections.max(map.keySet());
        answer[1] = map.get(answer[0]);
        
        return answer;
    }
}