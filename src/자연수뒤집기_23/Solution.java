package 자연수뒤집기_23;

class Solution {
    public int[] solution(long n) {

        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String[] strArr = sb.toString().split("");

        int[] answer = new int[sb.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(strArr[i]);
        }

        return answer;
    }
}
