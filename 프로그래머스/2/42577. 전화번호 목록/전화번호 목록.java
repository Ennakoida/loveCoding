import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> map = new HashMap<>();
        
        for(String num : phone_book) {
            map.put(num, num);
        }
        
        for(int i = 0; i < map.size(); i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                    break;
                }
            }
        }
        
        // for(int i = 0; i < phone_book.length; i++) {
        //     for(int j = 0; j < phone_book.length; j++) {
        //         if(j != i && phone_book[j].startsWith(phone_book[i])) {
        //             answer = false;
        //             break;
        //         }
        //     }   
        // }
        
        return answer;
    }
}