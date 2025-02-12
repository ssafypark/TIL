package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_09_조합구하기 {

    private static int N;
    private static int M;
    private static int[] cm;

    public static void DFS(int L, int start) {
        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(cm[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = start; i <= N; i++) {
                cm[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cm = new int[M];
        DFS(0, 1);
    }
}
