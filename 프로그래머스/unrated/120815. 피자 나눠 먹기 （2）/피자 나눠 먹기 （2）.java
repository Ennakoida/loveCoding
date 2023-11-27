class Solution {
    public int solution(int n) {      
        int i = 1, pizza = 1;
        
        if(n % 6 == 0) {
            return n / 6;
        } else {
            while(pizza % 6 != 0) {
                i++;
                pizza = n * i;
            }
            
            return pizza / 6;
        }
    }
}