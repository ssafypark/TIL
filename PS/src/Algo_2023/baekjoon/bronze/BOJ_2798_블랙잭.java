package Algo_2023.baekjoon.bronze;

import java.util.Scanner;

public class BOJ_2798_블랙잭 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static int sum;
    private static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                for(int k = j + 1; k < N; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum > max && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
