package 예산;

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            if (d[i] + sum > budget) {
                break;
            }
            sum += d[i];
            answer++;

        }

        return answer;
    }
}