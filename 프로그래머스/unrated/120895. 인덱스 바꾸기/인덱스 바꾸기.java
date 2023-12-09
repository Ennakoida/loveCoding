class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "", temp = "";
        String[] strArr = my_string.split("");
        
        temp = my_string.substring(num1, num1 + 1);
        strArr[num1] = strArr[num2];
        strArr[num2] = temp;
        
        for(String i : strArr) {
            answer += i;
        }
        
        return answer;
    }
}