import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String[] n2Str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            n2Str[i] = String.valueOf(numbers[i]);
        }

         Arrays.sort(n2Str, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        StringBuilder result = new StringBuilder();
        for (String numStr : n2Str) {
            if (result.toString().equals("0")) break;
            result.append(numStr);
        }

        return result.toString();
    }
}
