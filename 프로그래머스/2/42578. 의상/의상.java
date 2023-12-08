import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0, caseNum = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.get(clothes[i][1]) == null ? 1 : map.get(clothes[i][1]) + 1);
        }
        
        for (String key: map.keySet()){
            caseNum *= (map.get(key) + 1);
        }
        
        answer = caseNum - 1;
        
        return answer;
    }
}