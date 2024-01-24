import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int[] wSizes = new int[sizes.length];
        int[] hSizes = new int[sizes.length];
        
        for(int i = 0; i < sizes.length; i++) {
            wSizes[i] = Math.max(sizes[i][0], sizes[i][1]);
            hSizes[i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(wSizes);
        Arrays.sort(hSizes);
        
        return wSizes[sizes.length - 1] * hSizes[sizes.length - 1];
    }
}