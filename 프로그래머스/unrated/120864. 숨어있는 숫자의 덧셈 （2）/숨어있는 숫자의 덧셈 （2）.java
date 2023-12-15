class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", " ");
        String[] arr = my_string.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
            if(!arr[i].equals(""))
                answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}