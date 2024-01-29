import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        // Stack 사용
        Stack<Character> stack = new Stack<>();
        char c = ' ';
        
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else {
                if(stack.peek() == c) stack.pop();
                else stack.push(c);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
        
        
//         String[] arr = s.split("");
//         int cnt = 0;
        
//         while(String.join("", arr).length() != 0) {
//             for(int i = 0; i < arr.length - 1; i++) {
//                 if(!arr[i].equals("") && arr[i].equals(arr[i + 1])) {
//                     arr[i] = "";
//                     arr[i + 1] = "";
//                     cnt++;
//                     break;
//                 }
//             }    
//             arr = (String.join("", arr)).split("");
            
//             if(cnt == 0) return 0;
//         }

//         return 1;
    }
}