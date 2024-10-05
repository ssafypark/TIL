package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
입력값
3 2

출력값
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
* */
public class inf_04_중복순열_permutation {

    private static int N;
    private static int M;
    private static int[] permutation;

    public static void DFS(int depth) {
        if (depth == M) {
            for (int x : permutation) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= N; i++) {
                permutation[depth] = i;
                DFS(depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        permutation = new int[M];
        DFS(0);
    }
}
