import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int[] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr);
        
        int i = 0;
        for(int num : arr) {
            if(num == newArr[0]) continue;
            answer[i++] = num;
        }
        
        return answer;
    }
}