package baekjoon.silver;

import java.util.ArrayList;

public class Test {

    private static Integer[] arr = {1, 2, 3, 3, 4, 5, 6};

    public static void main(String[] args) {
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(i + 1);
        }
        System.out.println(list.size());
        while(!list.isEmpty()) {
            System.out.println(list.remove(0));
        }
    }
}
