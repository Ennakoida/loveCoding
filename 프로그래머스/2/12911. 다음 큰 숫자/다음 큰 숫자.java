class Solution {
    public int solution(int n) {
        int answer = n;
        
        //Integer.bitCount(n) -> n의 자리에 정수 입력 시, n의 이진수에서 1의 갯수 반환
        while(true) {
            if(Integer.bitCount(n) == Integer.bitCount(++answer)) break;
        }
        
        return answer;
    }
}