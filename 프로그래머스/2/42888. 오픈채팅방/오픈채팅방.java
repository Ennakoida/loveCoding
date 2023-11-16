import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] record) {
        int n = record.length;
        Map<String, String> userIdToNickname = new HashMap<>();

        for (String log : record) {
            String[] splitRecord = log.split(" ");
            String status = splitRecord[0];
            String userId = splitRecord[1];

            if (status.equals("Enter") || status.equals("Change")) {
                String nickname = splitRecord[2];
                userIdToNickname.put(userId, nickname);
            }
        }

        int answerLength = 0;
        for (String log : record) {
            String[] splitRecord = log.split(" ");
            String status = splitRecord[0];
            String userId = splitRecord[1];

            if (status.equals("Enter")) {
                answerLength++;
            } else if (status.equals("Leave")) {
                answerLength++;
            }
        }

        String[] answer = new String[answerLength];
        int index = 0;

        for (String log : record) {
            String[] splitRecord = log.split(" ");
            String status = splitRecord[0];
            String userId = splitRecord[1];

            if (status.equals("Enter")) {
                answer[index++] = userIdToNickname.get(userId) + "님이 들어왔습니다.";
            } else if (status.equals("Leave")) {
                answer[index++] = userIdToNickname.get(userId) + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}
