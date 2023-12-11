class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[] quizSplitArr;
        int X, Y, Z;
        String operator;
        
        for(int i = 0; i < quiz.length; i++) {
            quizSplitArr = quiz[i].split(" ");
            X = Integer.parseInt(quizSplitArr[0]);
            Y = Integer.parseInt(quizSplitArr[2]);
            Z = Integer.parseInt(quizSplitArr[4]);
            operator = quizSplitArr[1];
            
            switch(operator) {
                case "+" :
                    if(X + Y == Z) answer[i] = "O";
                    else answer[i] = "X";
                    break;
                case "-" :
                    if(X - Y == Z) answer[i] = "O";
                    else answer[i] = "X";
                    break;
            }
        }
        
        return answer;
    }
}