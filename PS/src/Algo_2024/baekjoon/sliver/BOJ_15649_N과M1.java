package Algo_2024.baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649_N과M1 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static int[] permu;
    private static int[] check;

    public static void permutation(int L) {
        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(permu[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    permu[L] = arr[i];
                    permutation(L + 1);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        check = new int[N];
        permu = new int[M];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        permutation(0);
    }
}
