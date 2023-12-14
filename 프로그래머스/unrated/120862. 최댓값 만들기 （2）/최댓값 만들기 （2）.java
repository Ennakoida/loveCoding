import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int multiple = 0;
        Arrays.sort(numbers);
        
        multiple = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        if(numbers[0] * numbers[1] > multiple) multiple = numbers[0] * numbers[1];
        
        return multiple;
    }
}