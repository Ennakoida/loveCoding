class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);
            
        for(int i = 0; i < orderStr.length(); i++) {
            if(orderStr.charAt(i) - '0' == 3 || orderStr.charAt(i) - '0' == 6 || orderStr.charAt(i) - '0' == 9 )
                answer++;
        }
        
        return answer;
    }
}