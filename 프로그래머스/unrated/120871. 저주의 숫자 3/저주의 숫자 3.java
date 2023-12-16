
class Solution {
    public int solution(int n) {
        int three = 0;
        
        for(int i = 1; i <= n; i++) {
            three++;
            while(true) {
                if(three % 3 == 0 || String.valueOf(three).contains("3")) ++three;
                else break;
            }
        }
        
        return three;
    }
}