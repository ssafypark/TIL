package Algo_2023.swea;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2603_중간값찾기 {

    private static int N;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(arr[N / 2]);
    }
}
