package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_15649_N과M1 {

    private static int N;
    private static int M;
    private static int[] arr;
    private static int[] output;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        output = new int[M];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        permutation(0);
    }

    private static void permutation(int depth) {
        StringBuilder sb = new StringBuilder();
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(output[i]).append(" ");
            }
            System.out.println(sb);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                output[depth] = arr[i];
                visited[i] = true;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}
