package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_06_순열구하기 {

    private static int N;
    private static int M;
    private static int[] pm;
    private static int[] arr;
    private static int[] check;

    public static void DFS(int L) {
        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
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
        pm = new int[M];
        arr = new int[N];
        check = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        DFS(0);
    }
}
