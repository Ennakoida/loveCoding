class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 50, luy = 50, rdx = 0, rdy = 0;
        
        // 시작점 : (y의 최솟값, x의 최솟값)
        // 끝점 : (y의 최댓값, x의 최댓값)
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                if((wallpaper[i].charAt(j)) == '#') {
                    if(i < lux) lux = i;
                    if(j < luy) luy = j;
                    
                    if(i > rdx) rdx = i;
                    if(j > rdy) rdy = j;
                }
            }
        }
        
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx + 1;
        answer[3] = rdy + 1;
        
        return answer;
    }
}