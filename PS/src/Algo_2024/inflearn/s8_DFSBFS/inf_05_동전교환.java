package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_05_동전교환 {

    private static int N;
    private static int M;
    private static int min = Integer.MAX_VALUE;
    private static int[] arr;

    public static void DFS(int L, int sum) {
        if (sum > M) {
            return;
        }
        if (min >= L) { // 최적화하기 위한 if문
            return;
        }
        if (M == sum) {
            min = Math.min(min, L);
        } else {
            for (int i = 0; i < N; i++) {
                DFS(L + 1, sum + arr[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        M = Integer.parseInt(br.readLine());
        DFS(0, 0);
        System.out.println(min);
    }
}
