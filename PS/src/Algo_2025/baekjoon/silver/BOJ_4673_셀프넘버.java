package Algo_2025.baekjoon.silver;

public class BOJ_4673_셀프넘버 {

    public static void main(String[] args) {
        int[] arr = new int[10001];
        for (int i = 1; i <= 10000; i++) {
            int sum = i;
            char[] chars = String.valueOf(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                sum += Integer.parseInt(String.valueOf(chars[j]));
            }
            if (sum <= 10000) {
                arr[sum] = 1;
            }
        }
        for (int i = 1; i <= 10000; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
