package 두정수의합_4;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int startNum = 0;
        int endNum = 0;

        if (a > b) {
            startNum = b;
            endNum = a;

        } else if (a < b) {
            startNum = a;
            endNum = b;

        } else {
            return a;
        }

        for (int i = startNum; i <= endNum; i++) {
            answer += i;
        }

        return answer;
    }
}
