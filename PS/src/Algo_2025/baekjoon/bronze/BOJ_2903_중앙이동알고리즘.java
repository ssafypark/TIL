package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2903_중앙이동알고리즘 {

    private static int N;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[16];
        arr[0] = 2;
        for (int i = 1; i < 16; i++) {
            arr[i] = (arr[i - 1] * 2) - 1;
        }
        System.out.println(arr[N] * arr[N]);
    }
}
