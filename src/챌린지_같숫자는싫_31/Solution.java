package 챌린지_같숫자는싫_31;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int preNum = 10;

        for (int j : arr) {
            if (j != preNum) {
                list.add(j);
                preNum = j;
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}