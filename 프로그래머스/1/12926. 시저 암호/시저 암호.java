class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char sChar = ' ';
        
        for(int i = 0; i < s.length(); i++) {
            sChar = s.charAt(i);
            if(sChar == ' ') 
                answer += " ";
            else {
                if((sChar + n > 90 && sChar < 97) || sChar + n > 122) 
                    answer += (char)(sChar + n - 26);
                else 
                    answer += (char)(sChar + n);
            }
        }
        
        return answer;
    }
}