package Algo_2023.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15654_N과M5_P1 {

    private static int N;
    private static int M;
    private static int[] numbers;
    private static boolean[] check;
    private static int[] output;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        check = new boolean[N];
        output = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);
        permutation(0);
    }

    public static void permutation(int depth) {
        // base case
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(output[i] + " ");
            }
            System.out.println(sb);
            return;
        }
        //recursive case
        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                check[i] = true;
                output[depth] = numbers[i];
                permutation(depth + 1);
                check[i] = false;
            }
        }
    }
}
