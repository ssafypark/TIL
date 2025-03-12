package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1015_수열정렬 {

    private static int N;
    private static int[] A;
    private static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = A[i];
        }
        Arrays.sort(B);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i] == B[j]) {
                    System.out.print(j + " ");
                    B[j] = -1;
                    break;
                }
            }
        }
    }
}
