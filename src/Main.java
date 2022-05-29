public class Main {
    public String solution(String phone) {
        String answer = "";
        String phoneNumber = "0" + phone; // 01062509911
        answer = phoneNumber.substring(0,3) + "-"+ phoneNumber.substring(3,7) + "-"+ phoneNumber.substring(7,11);
        return answer;
    }



    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution("1062509911"));
        System.out.println();
    }
}