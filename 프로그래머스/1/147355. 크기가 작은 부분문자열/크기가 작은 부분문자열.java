class Solution {
    public int solution(String t, String p) {
        int answer = 0, i = 0;
        
        while(true) {
            if(i + p.length() > t.length()) break;
            if(Long.parseLong(t.substring(i, i++ + p.length())) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}