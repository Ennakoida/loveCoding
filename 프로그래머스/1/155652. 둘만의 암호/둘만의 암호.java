class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "", alphabet = "abcdefghijklmnopqrstuvwxyz", str = "";
        char ch = ' ';
        int chIndex = 0;
        
        for(int i = 0; i < skip.length(); i++){
            str = String.valueOf(skip.charAt(i)); 
            alphabet = alphabet.replace(str, ""); 
        }
        
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);          
            chIndex = alphabet.indexOf(ch);
            
            chIndex = (chIndex + index) % alphabet.length();
            answer += alphabet.charAt(chIndex);
        }
        
        return answer;
    }
}
