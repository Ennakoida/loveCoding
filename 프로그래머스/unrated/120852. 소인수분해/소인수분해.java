import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                if(!answer.contains(i)) {
                    answer.add(i);
                }
                n /= i;
                i = 1;
            }
        }
        
        return answer;
    }
}