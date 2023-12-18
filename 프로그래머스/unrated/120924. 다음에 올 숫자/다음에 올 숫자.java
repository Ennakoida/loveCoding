class Solution {
    public int solution(int[] common) {
        int answer = 0, first = common[1] - common[0], last = common[2] - common[1];
        
        if(first == last) {
            answer = common[0] + (first * common.length);
        } else {
            answer = common[common.length - 1] * (last / first);
        }
        
        return answer;
    }
}