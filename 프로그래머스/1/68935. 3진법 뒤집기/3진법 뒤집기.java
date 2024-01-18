class Solution {
    public int solution(int n) {
        String toThree = Integer.toString(n, 3);
        StringBuffer sb = new StringBuffer(toThree);
        String reverse = sb.reverse().toString();
        
        return Integer.parseInt(reverse, 3);
    }
}