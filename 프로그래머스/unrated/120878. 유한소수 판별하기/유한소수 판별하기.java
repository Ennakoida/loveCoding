class Solution {
    public int solution(int a, int b) {
        for(int i = Math.min(a, b); i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }
        
        for(int i = 2; i <= b; i++) {
            if(b % i == 0) {
                if(i != 2 && i != 5) {
                    return 2;
                }
                
                b /= i;
                i = 1;
            }
        }
        
        return 1;
    }
}