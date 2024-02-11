import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] speakable = {"aya", "ye", "woo", "ma"};
        String[] unspeakable = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String bab : babbling) {
            for(String noword : unspeakable) {
                if(bab.contains(noword)) {
                    bab = bab.replaceAll(noword, "1");
                }
            }
            
            for(String word : speakable) {
                bab = bab.replaceAll(word, "2");
            }
            
            if(bab.replaceAll("2", "").equals("")) answer++;
        }      
        
        return answer;
    }
}