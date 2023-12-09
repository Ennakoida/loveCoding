import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "", alphabet = "";     
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            alphabet = s.substring(i, i+1);
            map.put(alphabet, map.get(alphabet) == null ? 1 : map.get(alphabet) + 1);
        }
        
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        
        for (String key : keySet) {
            if(map.get(key) == 1) answer += key;
        }
        
//         int[] alphabet = new int[25];
        
//         for(int i = 0; i < s.length(); i++) {
//             alphabet[s.charAt(i) - 97]++;
//         }
        
//         for(int i = 0; i < alphabet.length; i++) {
//             if(alphabet[i] == 1) {
//                 answer += (char)(i + 97);
//             }
//         }
        
        return answer;
    }
}