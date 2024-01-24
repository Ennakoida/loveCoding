import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        
        for(int i = 0; i < sizes.length; i++) {
            maxW = Math.max(maxW, Math.max(sizes[i][0], sizes[i][1]));
            maxH = Math.max(maxH, Math.min(sizes[i][0], sizes[i][1]));
        }
        
        return maxW * maxH;
    }
}