class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        boolean fail = false; // 끝말잇기 실패 여부 판별
        int personNum = 0, turnNum = 0; // 번호, 차례

        for(int i = 1; i < words.length; i++) {            
            // 앞사람이 말한 단어의 마지막 문자로 시작 여부 판별
            String end = words[i-1].substring(words[i-1].length() - 1, words[i-1].length()); // 이전 단어 끝 문자
            String start = words[i].substring(0, 1); // 현 단어 시작 문자
            
            if(!end.equals(start)) {
                fail = true;
            } else {
                // 중복 판별
                for(int j = 0; j < i; j++) {
                    if(words[i].equals(words[j])) {
                        fail = true;
                        break;
                    }
                } 
            }
            
            if(fail) {
                personNum = (i % n) + 1;
                turnNum = (i / n) + 1;
                break;
            }
        }
        
        answer[0] = personNum;
        answer[1] = turnNum;

        return answer;
    }
}