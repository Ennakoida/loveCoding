class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1, lastNum = numbers.length;
            
        if(k == 0) return answer;
        
        for(int i = 1; i < k; i++) {
            if(answer == lastNum) answer = 2;
            else if(answer == lastNum - 1) answer = 1;
            else answer += 2;
        }
        
        return answer;
    }
}