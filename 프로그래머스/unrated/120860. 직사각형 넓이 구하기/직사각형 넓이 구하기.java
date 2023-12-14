class Solution {
    public int solution(int[][] dots) {
        int width = 0, height = 0, minX = dots[0][0], maxX = dots[0][0], minY = dots[0][1], maxY = dots[0][1];

        for(int i = 0; i < 4; i++) {
            if(dots[i][0] <= minX) minX = dots[i][0];
            else maxX = dots[i][0];
        }
        
        for(int i = 0; i < 4; i++) {
            if(dots[i][1] <= minY) minY = dots[i][1];
            else maxY = dots[i][1];
        }
        
        width = maxX - minX;
        height = maxY - minY;
        
        System.out.println(width + ", " + height);
        return width * height;
    }
}
