package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_02_바둑이승차 {

    private static int C;
    private static int N;
    private static int max = Integer.MIN_VALUE;
    private static int[] arr;

    public static void DFS(int L, int sum) {
        if (sum > C) {
            return;
        }
        if (L == N) {
            max = Math.max(max, sum);
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        DFS(0, 0);
        System.out.println(max);
    }
}
