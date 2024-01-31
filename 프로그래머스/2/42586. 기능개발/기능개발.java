import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] cnt = new int[progresses.length];
        int num = 0, start = 0;
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < progresses.length; i++) {
            cnt[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : ((100 - progresses[i]) / speeds[i]) + 1;
            
            if(stack.isEmpty()) {
                stack.push(1);
                start = cnt[i];
            }
            else {
                if(start >= cnt[i]) {
                    num = stack.peek();
                    stack.pop();
                    stack.push(++num);
                } else {
                    stack.push(1);
                    start = cnt[i];
                }
            }  
        }
        
        int[] answer = new int[stack.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }
        
        return answer;
    }
}