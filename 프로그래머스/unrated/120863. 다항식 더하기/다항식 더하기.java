class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int sum = 0, num = 0, constant = 0;
        String[] arr = polynomial.split(" ");
        
        for(String str : arr) {
            if(str.contains("x")) {
                if(str.indexOf("x") == 0) num = 1; 
                else num = Integer.parseInt((str.substring(0, str.indexOf("x"))));
                sum += num;
            } else {
                if(!str.equals("+")) constant += Integer.parseInt(str);
            }
        }
        
        if(constant == 0) {
            if(sum == 1) answer = "x";
            else answer = sum + "x";
        } else if(sum == 0) {
            answer = constant + "";
        } else {
            if(sum == 1) answer = "x + " + constant;
            else answer = sum + "x + " + constant;
        }
        
        return answer;
    }
}