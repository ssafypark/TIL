package Algo_2023.swea.d2;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_1966_숫자를정렬하자 {

    private static int T;
    private static int N;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            arr = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            System.out.print("#" + tc + " ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
