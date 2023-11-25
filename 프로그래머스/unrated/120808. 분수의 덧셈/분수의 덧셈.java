class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numerator = (numer1 * denom2) + (numer2 * denom1); // 분자
        int denominator = denom1 * denom2; // 분모
        int endNum = Math.min(numerator, denominator);
        int max = 1;
        
        for(int i = 1; i <= endNum; i++) {
            if(numerator % i == 0 && denominator % i == 0) {
                max = i;
            }
        }
        
        answer[0] = numerator / max;
        answer[1] = denominator / max;
        
        return answer;
    }
}