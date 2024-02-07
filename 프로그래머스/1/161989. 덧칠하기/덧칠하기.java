class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] secPaint = new int[n];
        
        for(int num : section) {
            secPaint[num - 1] = 1;
        }
        
        for(int i = 0; i < secPaint.length; i++) {
            if(secPaint[i] == 1) {
                for(int j = i; j < (i + m > n ? n : i + m); j++) {
                    secPaint[j] = 0;
                }
                answer++;
            }
        }
        
        return answer;
    }
}