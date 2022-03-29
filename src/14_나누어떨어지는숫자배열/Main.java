package 나누어떨어지는숫자배열_14;

import java.util.ArrayList;
import java.util.Collections;

public class Main { // 출력 확인용
    public static void main(String[] args) {
        Solutions s = new Solutions();
        int arr[] = {1, 2, 3, 4, 5};
        int divisor = 5;
        ArrayList<Integer> c = s.solution(arr, divisor);
        System.out.println(c);
    }

    static class Solutions {
        public ArrayList<Integer> solution(int[] arr, int divisor) {
            // 반환 타입을 int형에서 ArrayList형으로 변환

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    list.add(arr[i]);
                }
            }
            if (list.isEmpty()) {
                list.add(-1);
            }
            Collections.sort(list);
            return list;
        }
    }
}

