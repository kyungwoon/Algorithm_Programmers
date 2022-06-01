class Solution {
    public String solution(int n) {
        String answer = "";

        String [] ontwothree = {"4", "1", "2"};

        while(n != 0) {
            answer = ontwothree[n%3] + answer;
            n = (n-1) / 3;
        }

        return answer;
    }
}