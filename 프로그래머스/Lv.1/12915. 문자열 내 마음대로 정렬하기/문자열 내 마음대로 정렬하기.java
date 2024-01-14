import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        HashMap<String, Character> map = new HashMap<>();
        for(String str : strings) {
            map.put(str, str.charAt(n));
        }
        
        List<String> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys, (v1, v2) -> {
            Comparable value1 = map.get(v1);
            Comparable value2 = map.get(v2);

            int result = value1.compareTo(value2);

            if (result == 0) {
                result = v1.compareTo(v2);
            }

            return result;
        });
        
        return keys.toArray(new String[0]);
    }
}