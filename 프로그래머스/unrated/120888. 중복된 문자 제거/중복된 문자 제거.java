class Solution {
    public String solution(String my_string) {
        String answer = "", addStr = my_string.substring(0, 1);
        
        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < i; j++) {
                if(my_string.substring(j, j+1).equals(my_string.substring(i, i+1))) {
                    addStr = "";
                    break;
                }
                   
                addStr = my_string.substring(i, i+1);
            }
            
            answer += addStr;
        }
        return answer;
    }
}