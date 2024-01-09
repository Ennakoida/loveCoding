class Solution {
    public String solution(String phone_number) {
        if(phone_number.length() == 4) return phone_number;
        
        for(int i = 0; i < phone_number.length() - 4; i++) {
            phone_number = phone_number.replaceFirst(phone_number.substring(i, i + 1), "*");
        }
        
        return phone_number;
    }
}