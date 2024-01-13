import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> baseList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                baseList.add(numbers[i] + numbers[j]);    
            }
        }
        
        for(int num : baseList) {
            if(!answerList.contains(num)) answerList.add(num);
        }
        
        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}