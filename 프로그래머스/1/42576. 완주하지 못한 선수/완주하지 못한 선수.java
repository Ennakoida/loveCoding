import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // ******* 1차 풀이 (효율성 시간 초과) *******
//         for(int i = 0; i < completion.length; i++) {
//             for(int j = 0; j < participant.length; j++) {
//                 if(completion[i].equals(participant[j])) {
//                     participant[j] = "";
//                     break;
//                 }
//             }
//         }
        
//         for(int i = 0; i < participant.length; i++) {
//             if(participant[i] != "") answer = participant[i];
//         }
        
        // ******* 2차 풀이 (통과 but Hash 이용X) *******
//         Arrays.sort(participant);
//         Arrays.sort(completion);
        
//         for(int i = 0; i < completion.length; i++) {
//             if(!participant[i].equals(completion[i])) {
//                 answer = participant[i];
//                 break;
//             } 
//         }
        
//         if(answer == "") {
//             answer = participant[participant.length - 1];
//         }
        
        // ******* 3차 풀이 (Hash 이용) *******
        HashMap<String, Integer> hash = new HashMap<>();
        
        for(String key : participant) hash.put(key, hash.getOrDefault(key, 0) + 1);
        for(String key : completion) hash.put(key, hash.get(key) - 1);
        
        for(String key : hash.keySet()) {
            if(hash.get(key) != 0) answer = key;
        }
        
            
        return answer;
    }
}