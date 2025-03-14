package Algo_2024.baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15650_N과M2 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static int[] combi;
    private static int[] check;

    public static void DFS(int L, int start) {
        if (L == M) {
            StringBuilder sb = new StringBuilder();
            for (int x : combi) {
                sb.append(x).append(" ");
            }
            System.out.println(sb);
        } else {
            for (int i = start; i <= N; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        combi = new int[M];
        DFS(0, 1);
    }
}
