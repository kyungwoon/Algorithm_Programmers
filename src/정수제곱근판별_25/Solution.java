package 정수제곱근판별_25;

class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        if(n == Math.pow(sqrt,2)) {
            return (long)(Math.pow(sqrt+1, 2));
        }else {
            return -1;
        }
    }
}