class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            if(food[i] >= 2) {
                for(int j = 0; j < food[i] / 2; j++) {
                    answer += i + "";
                }
            }
        }
        
        StringBuffer sb = new StringBuffer(answer);        
        String reverse = sb.reverse().toString();
        
        answer += "0";
        answer += reverse;
        
        return answer;
    }
}