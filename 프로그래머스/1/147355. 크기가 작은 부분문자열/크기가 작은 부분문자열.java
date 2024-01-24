class Solution {
    public int solution(String t, String p) {
        int answer = 0, i = 0, pLength = p.length();
        
        while(true) {
            if(i + pLength > t.length()) break;
            if(Long.parseLong(t.substring(i, i++ + pLength)) <= Long.parseLong(p)) answer++;
        }
        
        return answer;
    }
}