class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1Index = 0;
        int c2Index = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (c1Index < cards1.length && goal[i].equals(cards1[c1Index])) {
                c1Index++;
            } else if(c2Index < cards2.length && goal[i].equals(cards2[c2Index])) {
                c2Index++;
            } else {
                return "No";
            }
        }
        
        return answer;
    }
}