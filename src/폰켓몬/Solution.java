package 폰켓몬;

import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int max = nums.length / 2;

        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hash.add(nums[i]);
        }

        if (max < hash.size()) {
            answer = max;
        } else if (max >= hash.size()) {
            answer = hash.size();
        }

        return answer;
    }
}
