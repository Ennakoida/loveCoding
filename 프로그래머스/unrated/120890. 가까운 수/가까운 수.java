import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0, distance = 0, existingLocation = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int location : array) {
            distance = Math.abs(location - n);
            
            if(map.containsKey(distance)) {
                existingLocation = map.get(distance);
                map.put(distance, Math.min(location, existingLocation));
            } else {
                map.put(distance, location);
            }
        }
        
        answer = map.get(Collections.min(map.keySet()));
        
        return answer;
    }
}