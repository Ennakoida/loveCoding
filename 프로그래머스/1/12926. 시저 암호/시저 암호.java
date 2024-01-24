class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') answer += " ";
            else {
                if((s.charAt(i) + n > 90 && s.charAt(i) < 97) || s.charAt(i) + n > 122) 
                    answer += (char)(s.charAt(i) + n - 26);
                else 
                    answer += (char)(s.charAt(i) + n);
            }
        }
        
        System.out.println(answer);
        
        return answer;
    }
}