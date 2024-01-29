class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String newStr = s;
        
        while(!newStr.equals("1")) {
            for(int i = 0; i < s.length(); i++) {
                if(!newStr.contains("0")) break;

                if(s.charAt(i) == '0') {
                    answer[1]++;
                    newStr = newStr.replaceFirst("0", "");
                }
            }

            newStr = Integer.toBinaryString(newStr.length());
            s = newStr;
            answer[0]++;
        }
    
        return answer;
    }
}