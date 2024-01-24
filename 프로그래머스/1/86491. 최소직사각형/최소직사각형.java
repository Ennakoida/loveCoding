import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] wSizes = new int[sizes.length];
        int[] hSizes = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++) {
            wSizes[i] = Math.max(sizes[i][0], sizes[i][1]);
            hSizes[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        int maxW = Arrays.stream(wSizes).max().getAsInt();
        int maxH = Arrays.stream(hSizes).max().getAsInt();
        
        return maxW * maxH;
    }
}