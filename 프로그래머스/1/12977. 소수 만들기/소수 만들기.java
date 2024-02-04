class Solution {
    public int solution(int[] nums) {
        int answer = 0, sum = 0;
        boolean check = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    check = true;

                    for (int l = 2; l <= Math.sqrt(sum); l++) {
                        if (sum % l == 0) {
                            check = false;
                            break;
                        }
                    }

                    if (check) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
