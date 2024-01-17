class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        int cnt = 0;
        
        while(cnt < count) {
            cnt++;
            totalPrice += (price * cnt);
        }
        
        if(totalPrice <= money) return 0;
        
        return totalPrice - money;
    }
}