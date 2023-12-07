import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
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
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            } 
        }
        
        if(answer == "") {
            answer = participant[participant.length - 1];
        }
        
        return answer;
    }
}