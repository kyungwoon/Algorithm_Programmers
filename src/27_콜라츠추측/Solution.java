package 콜라츠추측_27;

class Solution {
    public int solution(int num) {
        int answer = 0;

        while (num != 1 && answer != 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }
            answer++;
        }

        if (answer == 500) {
            answer = -1;
        }
        return answer;
    }
}
