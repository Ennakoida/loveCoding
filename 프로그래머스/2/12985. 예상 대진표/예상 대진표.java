class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1; // 첫 라운드는 1

        // 로그를 이용하여 총 대전 가능 횟수만큼 반복
        for(int i = 0; i < (int)(Math.log(n) / Math.log(2)) + 1; i++) { 
            if(Math.max(a, b) - Math.min(a, b) == 1     // a와 b의 순번이 연속되면서
                         && Math.min(a, b) % 2 == 1) {  // a와 b 중 작은 순번이 홀수일 때
                break;
            }
            
            a = (int)Math.ceil((double)a/2); // a의 새로운 순번
            b = (int)Math.ceil((double)b/2); // b의 새로운 순번
            answer++; // 라운드 증가
        }

        return answer;
    }
}