package 하샤드수_28;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int xNum = x;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        if (xNum % sum == 0) {
            return answer;
        } else {
            answer = false;
        }
        return answer;
    }
}