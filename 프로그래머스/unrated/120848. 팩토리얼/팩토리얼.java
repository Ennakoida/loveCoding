class Solution {
    public int solution(int n) {
        int answer = 0, factorial = 1;
        
        for(int i = 1; ; i++){
            factorial *= i;
            
            if(n < factorial) {
                answer = i - 1;
                break;
            }
        }
        
        return answer;
    }
}