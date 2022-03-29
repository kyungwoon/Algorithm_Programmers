package 모의고사_몇시간몇분했더라;

public class Main {
    public String solution(String[] arr1, String[] arr2) {
        int allTime = 0;
        String answer = "";
        int checkIn = 0;
        int checkOut = 0;
        for (int i = 0; i < arr1.length; i++) {
            String[] checkInArr = arr1[i].split(":");
            String[] checkOutArr = arr2[i].split(":");

            checkIn += Integer.parseInt(checkInArr[0]) * 60 + Integer.parseInt(checkInArr[1]);

            if (Integer.parseInt(checkOutArr[0]) >= 29) {
                checkOut += 21 * 60;
            } else {
                checkOut += Integer.parseInt(checkOutArr[0]) * 60 + Integer.parseInt(checkOutArr[1]);
            }
        }

        allTime = checkOut - checkIn;
        answer = (allTime / 60) + "시간 " + (allTime % 60) + "분";


        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        String[] arr1 = {"8:42", "9:00", "8:50", "8:47", "9:01", "8:51", "8:59"};
        String[] arr2 = {"21:42", "23:10", "25:30", "29:10", "23:11", "26:44", "29:26"};
        System.out.println(method.solution(arr1, arr2));
    }
}
