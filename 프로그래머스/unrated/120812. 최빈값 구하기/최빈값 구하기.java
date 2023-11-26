import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0, max = 0, cnt = 0;
        int arr[] = new int[1000];
        
        if(array.length == 1) {
            return array[0];
        }
        
        for(int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                answer = i;
                max = arr[i];
            } 
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) {
                cnt++;
            }
            
            if(cnt > 1) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}