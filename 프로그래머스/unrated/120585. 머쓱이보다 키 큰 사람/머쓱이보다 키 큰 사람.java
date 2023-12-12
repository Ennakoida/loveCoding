import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int order = 0;
        Arrays.sort(array);
        
        for(int item : array) {
            if(item > height) break;
            order++;
        }
        
        return array.length - order;
    }
}