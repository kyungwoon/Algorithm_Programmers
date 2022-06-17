package 챌린지_최소직사각_30;


class Solution {
    public int solution(int[][] sizes) {
        int answer;
        int maxWidth = 0;
        int maxHight = 0;

        for (int[] size : sizes) {
            int width = Math.max(size[0], size[1]);
            int hight = Math.min(size[0], size[1]);
            maxWidth = Math.max(maxWidth, width);
            maxHight = Math.max(maxHight, hight);
        }

        answer = maxWidth * maxHight;
        return answer;
    }
}