class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) { // 지뢰가 설치
                    if(i >= 1 && board[i - 1][j] != 1) {
                        board[i - 1][j] = -1; // 상
                        if(j >= 1 && board[i - 1][j - 1] != 1) board[i - 1][j - 1] = -1; // 좌상
                        if(j < board.length - 1 && board[i - 1][j + 1] != 1) board[i - 1][j + 1] = -1; // 우상
                    }
                    if(i < board.length - 1 && board[i + 1][j] != 1) {
                        board[i + 1][j] = -1; // 하
                        if(j >= 1 && board[i + 1][j - 1] != 1) board[i + 1][j - 1] = -1; // 좌하
                        if(j < board.length - 1 && board[i + 1][j + 1] != 1) board[i + 1][j + 1] = -1; // 우하
                    }
                    if(j >= 1 && board[i][j - 1] != 1) board[i][j - 1] = -1; // 좌
                    if(j < board.length - 1 && board[i][j + 1] != 1) board[i][j + 1] = -1; // 우
                }
            }
        }
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        
        return answer;
    }
}