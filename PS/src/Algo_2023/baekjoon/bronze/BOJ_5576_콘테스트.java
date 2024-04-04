package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_5576_콘테스트 {

    private static int[] W;
    private static int[] K;
    private static int sumW;
    private static int sumK;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        W = new int[10];
        K = new int[10];
        for(int i = 0 ; i < 10; i++) {
            W[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0 ; i < 10; i++) {
            K[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(W);
        Arrays.sort(K);
        for (int i = 9; i > 6; i--) {
            sumW += W[i];
            sumK += K[i];
        }
        System.out.println(sumW + " " + sumK);
    }
}
