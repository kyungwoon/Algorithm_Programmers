package 챌린지_최소직사각_30;


class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHight = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int hight = Math.min(sizes[i][0], sizes[i][1]);
            maxWidth = Math.max(maxWidth, width);
            maxHight = Math.max(maxHight, hight);
        }
        answer = maxWidth * maxHight;
        return answer;
    }
}