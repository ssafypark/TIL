package Algo_2023.baekjoon.bronze;

import java.util.Scanner;

public class BOJ_2577_숫자의개수 {

    private static int A;
    private static int B;
    private static int C;
    private static int[] arr;
    private static String str;
    private static String str2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        arr = new int[10];
//        str = String.valueOf(A * B * C);
        str2 = Integer.toString(A * B * C);

        for (int i = 0; i < str.length(); i++) {
//            arr[str.charAt(i) - '0']++;
            arr[str2.charAt(i) - 48]++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
