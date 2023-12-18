import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0, j = 0;
        String[] aSplit = A.split("");
        String[] temp = new String[aSplit.length];
        
        if(A.equals(B)) return 0;
        
        while(j < A.length()){
            answer++;
            
            temp[0] = aSplit[aSplit.length - 1];
            for(int i = 0; i < aSplit.length - 1; i++) {
                temp[i + 1] = aSplit[i];  
            }
            
            if((String.join("", temp)).equals(B)) break;
            aSplit = Arrays.copyOf(temp, temp.length);
            
            j++;
        }
        
        if(j == A.length()) answer = -1;
        
        return answer;
    }
}