class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        
        for(int i = 0; i < sArr.length; i++) {
            if(i == 0) {
                sArr[i] = sArr[i].toUpperCase();
                continue;
            } else {
                if(sArr[i - 1].equals(" ")) sArr[i] = sArr[i].toUpperCase();
                else sArr[i] = sArr[i].toLowerCase();
            }
        }
        
        return String.join("", sArr);
    }
}