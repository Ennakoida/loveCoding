import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int c = 0; c < commands.length; c++) {
            int[] arr = new int[commands[c][1] - commands[c][0] + 1];
            int startNum = commands[c][0];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = array[startNum++ - 1];
            }
            
            Arrays.sort(arr);
            answer[c] = arr[commands[c][2] - 1];
        }
        
        return answer;
    }
}