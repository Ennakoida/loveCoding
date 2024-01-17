class Solution {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;
        int cnt = 0;
        
        while(cnt < count) {
            cnt++;
            totalPrice += (price * cnt);
        }
        
        return totalPrice <= money ? 0 : totalPrice - money;
    }
}