package 완주하지못한선수;

import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        for (String com : completion) {
            map.put(com, map.get(com) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                answer = key;
            }
        }

        return answer;
    }
}
