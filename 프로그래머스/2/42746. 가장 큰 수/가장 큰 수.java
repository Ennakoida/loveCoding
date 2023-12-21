import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String[] n2Str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            n2Str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(n2Str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String concat1 = s1 + s2;
                String concat2 = s2 + s1;
                return concat2.compareTo(concat1);
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
