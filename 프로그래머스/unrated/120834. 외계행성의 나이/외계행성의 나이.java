class Solution {
    public String solution(int age) {
        String answer = "";
        String ageString = String.valueOf(age);
        int i = 0;
        
        while(i < ageString.length()) {
            answer = AgeToEng(ageString.charAt(i++), answer);
        }
        
        return answer;
    }
    
    public String AgeToEng(char num, String answer){
        switch (num) {
            case '0' : answer += "a"; break;
            case '1' : answer += "b"; break;
            case '2' : answer += "c"; break;
            case '3' : answer += "d"; break;
            case '4' : answer += "e"; break;
            case '5' : answer += "f"; break;
            case '6' : answer += "g"; break;
            case '7' : answer += "h"; break;
            case '8' : answer += "i"; break;
            case '9' : answer += "j"; break;
        }
        
        return answer;
    }
}