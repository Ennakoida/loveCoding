class Solution {
    public boolean solution(int x) {
        int num = 0;
        String xStr = String.valueOf(x);
        
        for(int i = 0; i < xStr.length(); i++) {
            num += xStr.charAt(i) - '0';
        }
        
        if(x % num == 0) return true;
        else return false;
    }
}