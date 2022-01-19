package 제일작은제거하기;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            } else {
                answer[index] = arr[i];
                index++;
            }

        }
        return answer;
    }
}