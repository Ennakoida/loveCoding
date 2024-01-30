class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int date = 0;
        
        if(a > 1) {
            for(int i = 0; i < a - 1; i++) {
                date += month[i];
            }    
            
            b += date;
        } 
        
        return String.valueOf(day[(b - 1) % 7]);
    }
}