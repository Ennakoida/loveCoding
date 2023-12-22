import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
           if(citations[i] >= citations.length - i) {
               answer = citations.length - i ;   // citations[i];
               break;
           }
//             if(citations.length == 1) {
// //                System.out.println("1");
//                 return citations[i];
//             } else if(citations[i] >= (int)((citations.length+1)/2.0)) 
//             {
// //                System.out.println(i + "," + citations[i] + "," + (int)((citations.length+1)/2.0));
//                 return citations[i];
//             }
        }
        return answer;
    }
}