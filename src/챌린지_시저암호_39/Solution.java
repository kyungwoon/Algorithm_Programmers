package 챌린지_시저암호_39;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (s.charAt(i) + n > 'z') {
                    answer += (char) (s.charAt(i) + n - 26);
                } else {
                    answer += (char) (s.charAt(i) + n);
                }
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                if (s.charAt(i) + n > 'Z') {
                    answer += (char) (s.charAt(i) + n - 26);
                } else {
                    answer += (char) (s.charAt(i) + n);
                }
            } else if (s.charAt(i) == ' ') {
                answer += (char) (s.charAt(i));
            }
        }
        return answer;
    }
}