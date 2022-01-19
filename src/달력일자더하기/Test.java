package 달력일자더하기;

public class Test {
    public String solution(int month, int day) {
        String answer = "";

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int completion = 98;
        int alldays = completion - (days[month - 1] - day); //85
        int monthCnt = month + 1;

        for (int i = month; i <= days.length; i++) {
            if (alldays > days[i]) {
                alldays -= days[i];
                monthCnt++;
            } else {
                answer = monthCnt + "월 " + alldays + "일";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test method = new Test();
        System.out.println(method.solution(1, 18));
    }
}