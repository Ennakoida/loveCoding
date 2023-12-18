class Solution {
    public int solution(String before, String after) {
        int cnt = 0;
        String[] bArr = before.split("");
        String[] aArr = after.split("");
        
        for(int i = 0; i < bArr.length; i++) {
            for(int j = 0; j < aArr.length; j++) {
                if(bArr[i].equals(aArr[j])) {
                    aArr[j] = "0";
                    cnt++;
                    break;
                }
            }
        }
        
        if(cnt == bArr.length) return 1;
        
        return 0;
    }
}