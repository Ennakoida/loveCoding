class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0, y = 0;
        
        for(String key : keyinput) {
            switch(key) {
                case "up":
                    if(y >= (int)(board[1] / 2)) continue;
                    y += 1;
                    break;
                case "down":
                    if(y <= (int)(board[1] / 2) * -1) continue;
                    y -= 1;
                    break;
                case "left":
                    if(x <= (int)(board[0] / 2) * -1) continue;
                    x -= 1;
                    break;
                case "right":
                    if(x >= (int)(board[0] / 2)) continue;
                    x += 1;
                    break;
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
