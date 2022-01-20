package 챌린지_문자열정렬_35;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);

        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}