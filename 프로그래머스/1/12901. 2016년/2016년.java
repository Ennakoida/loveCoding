class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int date = 0;
        
        if(a > 1) {
            for(int i = 0; i < a - 1; i++) {
                date += month[i];
            }    
            answer = day[(date + b) % 7];            
        } else {
            answer = day[b % 7];
        }
        
        return answer;
    }
}