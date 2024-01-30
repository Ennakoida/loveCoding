class Solution {
    public String solution(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        if(a > 1) {
            for(int i = 0; i < a - 1; i++) {
                b += month[i];
            }    
        } 
        
        return String.valueOf(day[(b - 1) % 7]);
    }
}