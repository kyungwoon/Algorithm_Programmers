package JadenCase;

class Solution {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        answer += str[0].toUpperCase();
        for (int i = 1; i < str.length; i++) {
            if (!str[i - 1].equals(" ")) {
                answer += str[i].toLowerCase();
            } else if (str[i - 1].equals(" ")) {
                answer += str[i].toUpperCase();
            }
        }

        return answer;
    }
}
