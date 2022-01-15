package x만큼간격이있는n개의숫자_11;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = sum + x;
            sum = answer[i];
        }

        return answer;
    }
}