package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
입력값
3 2
3 6 9

출력값
3 6
3 9
6 3
6 9
9 3
9 6

* */
public class inf_06_순열구하기_중복X {

    private static int N;
    private static int M;
    private static int[] arr;
    private static int[] check;
    private static int[] permutation;

    public static void DFS(int L) {
        if (L == M) { // 두자리 만들었을때
             StringBuilder sb = new StringBuilder();
             for (int i = 0; i < M; i++) {
                 sb.append(permutation[i]).append(" ");
             }
             System.out.println(sb);
        } else {
            for (int i = 0; i < N; i++) {
                if (check[i] == 0) { // 체크배열이 쓰이지 않았을때
                    check[i] = 1;
                    permutation[L] = arr[i];
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
        arr = new int[N];
        check = new int[N];
        permutation = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        DFS(0);
    }
}
