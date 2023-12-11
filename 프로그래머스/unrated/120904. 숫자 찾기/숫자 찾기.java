class Solution {
    public int solution(int num, int k) {
        int answer = -1, ten = 0;
        String numStr = num+"", kStr = k+"";
        
        for(int i = 0; i < numStr.length(); i++){
            if(numStr.substring(i, i+1).equals(kStr)) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}