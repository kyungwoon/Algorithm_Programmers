package 챌린지_모의고사_34;


import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int person1Cnt = 0, person2Cnt = 0, person3Cnt = 0;

        for (int i = 0; i < answers.length; i++) {
            if (person1[i % person1.length] == answers[i]) {
                person1Cnt++;
            }
            if (person2[i % person2.length] == answers[i]) {
                person2Cnt++;
            }
            if (person3[i % person3.length] == answers[i]) {
                person3Cnt++;
            }
        }

        int max = Math.max(Math.max(person1Cnt, person2Cnt), person3Cnt);
        ArrayList<Integer> list = new ArrayList<>();

        if (max == person1Cnt) {
            list.add(1);
        }
        if (max == person2Cnt) {
            list.add(2);
        }
        if (max == person3Cnt) {
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
