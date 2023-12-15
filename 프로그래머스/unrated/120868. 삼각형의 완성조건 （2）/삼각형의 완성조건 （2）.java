class Solution {
    public int solution(int[] sides) {
        int answer = 0, max = Math.max(sides[0], sides[1]), min = Math.min(sides[0], sides[1]);
        
        // 가장 긴 변이 sides에 포함될 때
        for(int i = 1; i < max; i++) {
            if(max - min < i) answer++;
        }
        
        // 가장 긴 변이 sides에 포함되지 않을 때
        for(int i = max; ; i++) {
            if(i >= sides[0] + sides[1]) break;
            answer++;
        }
        
        return answer;
    }
}