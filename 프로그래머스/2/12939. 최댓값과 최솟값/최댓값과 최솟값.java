import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String sArr[] = s.split(" ");
        int intArr[] = new int[sArr.length];
        
        for(int i = 0; i < sArr.length; i++) {
            intArr[i] = Integer.parseInt(sArr[i]);
        }
        
        Arrays.sort(intArr);
        
        return intArr[0] + " " + intArr[intArr.length - 1];
    }
}