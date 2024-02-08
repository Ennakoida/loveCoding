import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Double> map = new HashMap<>();
        int tryPpl, failPpl;
        
        for(int i = 1; i <= N; i++) {
            tryPpl = 0;
            failPpl = 0;
            
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] == i) {
                    failPpl++;
                    tryPpl++;
                } else if(stages[j] > i) tryPpl++;
            }
            
            map.put(i, tryPpl == 0 ? 0.0 : (double)failPpl / tryPpl);
        }
        
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys, (v1, v2) -> (map.get(v2).compareTo(map.get(v1)))); 
        
        int i = 0;
		for (Integer key : keys) {
            answer[i++] = key;
		}
        
        return answer;
    }
}