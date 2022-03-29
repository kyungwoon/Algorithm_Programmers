package 부족한금액계산하기_12;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            totalPrice += price * i;
        }
        if (totalPrice <= money) {
            return 0;
        } else {
            return totalPrice - money;
        }
    }
}
