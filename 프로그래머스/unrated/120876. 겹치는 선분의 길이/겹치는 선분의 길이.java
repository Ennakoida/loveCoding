import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int index = 0; index < 3; index++){
            for(int i = lines[index][0] + 1; i <= lines[index][1]; i++) {
                map.put(i, map.get(i) == null ? 0 : map.get(i) + 1);
            }    
        }
        
        for(int line : map.keySet()) {
            if(map.get(line) >= 1) answer++;
        }
        
        return answer;
    }
}