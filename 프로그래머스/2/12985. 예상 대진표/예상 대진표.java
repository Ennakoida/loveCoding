class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0; // 라운드 수

        /*
            a의 대진과 b의 대진의 번호가 같을 때 서로 붙게 된다. 
            따라서 다를 경우 반복하며 라운드 수를 증가시켜주면 된다.
        */
        while(a != b) { 
            a = (int)Math.ceil((double)a/2); // a의 대진
            b = (int)Math.ceil((double)b/2); // b의 대진
            answer++; // 라운드 증가
        }

        return answer;
    }
}