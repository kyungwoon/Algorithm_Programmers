package 체육복;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] student = new int[n];

        for (int l : lost) {
            student[l - 1]--;
        }
        for (int r : reserve) {
            student[r - 1]++;
        }

        for (int i = 0; i < student.length; i++) {
            if (student[i] == -1) {
                if (i != 0 && student[i - 1] == 1) {
                    student[i]++;
                    student[i - 1]--;
                } else if (i != student.length - 1 && student[i + 1] == 1) {
                    student[i]++;
                    student[i + 1]--;
                }
            }
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] != -1) {
                answer++;
            }
        }
        return answer;
    }
}
