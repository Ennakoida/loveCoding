import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> topK = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            topK.add(score[i]);
            
            if (topK.size() > k) {
                topK.remove(Collections.min(topK));
            }
            
            answer[i] = Collections.min(topK);
        }
        
        return answer;
    }
}