package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 입력
* 3 2
*
* 출력
* 1 1
* 1 2
* 1 3
* 2 1
* 2 2
* 2 3
* 3 1
* 3 2
* 3 3
*
* */

public class inf_04_중복순열 {

    private static int N;
    private static int M;
    private static int[] pm;

    public static void DFS(int L) {
        if (L == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(pm[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        pm = new int[M];
        DFS(0);
    }
}
