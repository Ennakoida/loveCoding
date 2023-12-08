import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int item : nums) {
            map.put(item, 1);
        }
        
        if(map.size() < nums.length / 2) {
            answer = map.size();
        } else {
            answer = nums.length / 2;
        }
        
        return answer;
    }
}