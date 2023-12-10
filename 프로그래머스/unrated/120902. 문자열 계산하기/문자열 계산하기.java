import java.util.*;
import javax.script.*;

class Solution {
    public int solution(String my_string) throws ScriptException {
        // ********** HashMap을 이용 ************
//         int plus = 0, minus = 0;
//         String[] mathematical = my_string.split(" ");
//         HashMap<Integer, String> map = new HashMap<>();
        
//         for(int i = 2; i < mathematical.length; i++) {
//             if(mathematical[i - 1].equals("+")) {
//                 map.put(Integer.parseInt(mathematical[i]), "+");
//             } else if(mathematical[i - 1].equals("-")) {
//                 map.put(Integer.parseInt(mathematical[i]), "-");
//             }
//         }
        
//         for(Integer key : map.keySet()){
//             if(map.get(key).equals("+")) plus += key;
//             else minus += key;
//         }
        
//         return Integer.parseInt(mathematical[0]) + plus - minus;
        
        // ********** 기본 switch case 이용 ************
//         String[] mathematical = my_string.split(" ");
//         int answer = Integer.parseInt(mathematical[0]);
        
//         for(int i = 1; i < mathematical.length; i+=2) {
//             switch (mathematical[i]){
//                 case "+" :
//                     answer += Integer.parseInt(mathematical[i + 1]);
//                     break;
//                 case "-" :
//                     answer -= Integer.parseInt(mathematical[i + 1]);
//                     break;
//             }
//         }
        
        // ********* Javascript 함수 이용 *********
        // throws Exception 처리 필요
        ScriptEngineManager s = new ScriptEngineManager();
        ScriptEngine engine = s.getEngineByName("JavaScript");
        int answer = (int)engine.eval(my_string);
        
        return answer;
    }
}