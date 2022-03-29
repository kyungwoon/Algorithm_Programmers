package 달력_2016년_13;

class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int allDate = b - 1;

        for (int i = 0; i < a - 1; i++) {
            allDate += month[i];
        }

        answer = week[allDate % 7];

        return answer;
    }
}