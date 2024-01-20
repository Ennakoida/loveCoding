class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            for(String photoStr : photo[i]) {
                for(int j = 0; j < name.length; j++) {
                    if(photoStr.equals(name[j])) answer[i] += yearning[j];
                }
            }
            
        }
        
        return answer;
    }
}