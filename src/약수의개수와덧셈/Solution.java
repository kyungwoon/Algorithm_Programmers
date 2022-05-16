package 약수의개수와덧셈;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        //1. left부터 right사이에 있는 모든 수의 약수의 갯수를 구한다

        for (int i = left; i <= right; i++) {
            int divisor_cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisor_cnt++;
                }
            }
            if (divisor_cnt % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        //2. 약수는 나누어 떨어지면 카운팅
        //3. 약수의 갯수가 짝수면 더해주고 홀수면 뺴준다

        return answer;
    }
}
