import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        StringBuilder resultBuilder = new StringBuilder(); // 만들 수 있는 가장 큰 정수 생성을 위한 동적배열
        int cntNotPartener = 0; // 짝꿍이 없을 때를 판별
        
        // X와 Y를 각각 substring하여 0~9의 값을 배열의 해당 인덱스(0~9)에 저장
        for(int i = 0; i < X.length(); i++){
            xArr[Integer.parseInt(X.substring(i, i+1))]++;
        }
        
        for(int i = 0; i < Y.length(); i++){
            yArr[Integer.parseInt(Y.substring(i, i+1))]++;
        }
        
        // 짝이 있는 숫자를 찾아서 resultBuilder에 추가
        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(xArr[i], yArr[i]);
            for (int j = 0; j < minCount; j++) {
                resultBuilder.append(i);
                cntNotPartener++;
            }
        }
        
        if(cntNotPartener == 0) {
            answer = "-1";
        } else {
            // 앞에 있는 0 제거
            while (resultBuilder.length() > 0 && resultBuilder.charAt(0) == '0') {
                resultBuilder.deleteCharAt(0);
            }
            
            // 0으로만 구성된 경우 처리
            if (resultBuilder.length() == 0) {
                answer = "0";
            } else {
                answer = resultBuilder.toString();
            }
        }
        
        return answer;
    }
}