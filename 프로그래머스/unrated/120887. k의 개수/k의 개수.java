class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "", kStr = k + "";
        
        for(int num = i; num <= j; num++) {
            str += num;
        }
        
        for(int a = 0; a < str.length(); a++) {
            if((str.substring(a, a + 1)).equals(kStr)) answer++;
        }
        
        return answer;
    }
}