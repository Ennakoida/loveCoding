class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];       
        
        for(int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = "0".repeat(n - binary.length()) + binary;
            answer[i] = binary.replaceAll("1", "#").replaceAll("0", " ");
        }
        
        return answer;
    }
}
