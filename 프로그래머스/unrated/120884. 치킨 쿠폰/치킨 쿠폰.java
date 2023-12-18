class Solution {
    public int solution(int chicken) {
        int answer = 0, rest = 0;
        
        while(true) {
            answer += chicken / 10;
            rest += chicken % 10;
            if(chicken / 10 == 0) break;
            chicken /= 10;
        }

        while(true) {
            if(rest / 10 == 0) break;
            answer += rest / 10;
            rest = (rest / 10) + (rest % 10);
        }
        
        return answer;
    }
}