class Solution {
    public String solution(String my_string) {
        String answer = "";
        char charMyString = ' ';
        
        for(int i = 0; i < my_string.length(); i++){
            charMyString = my_string.charAt(i);
            if(charMyString < 97) {
                answer += (String.valueOf(charMyString)).toLowerCase();
            } else {
                answer += (String.valueOf(charMyString)).toUpperCase();
            }
        }
        return answer;
    }
}