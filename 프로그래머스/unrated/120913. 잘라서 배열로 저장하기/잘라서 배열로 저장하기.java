class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil((double)my_str.length() / n)];
        
        for(int i = 0, j = 0; i < my_str.length(); i += n, j++) {
            if(i + n <= my_str.length()) {
                answer[j] = my_str.substring(i, i + n);
            } else {
                answer[j] = my_str.substring(i);
                break;
            }
        }
        
        return answer;
    }
}