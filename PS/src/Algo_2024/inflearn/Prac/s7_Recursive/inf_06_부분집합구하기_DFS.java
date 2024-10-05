package Algo_2024.inflearn.Prac.s7_Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_06_부분집합구하기_DFS {

    private static int N;
    private static int[] check;

    public static void DFS(int depth) {
        if (depth == N + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                if(check[i] == 1){
                    sb.append(i).append(" ");
                }
            }
            if (sb.length() > 0) {
                System.out.println(sb);
            }
        } else {
            // 두 갈래로 뻗음
            // 왼쪽으로 뻗는 이진트리
            check[depth] = 1;
            DFS(depth + 1);
            // 오른쪽으로 뻗는 이진트리
            check[depth] = 0;
            DFS(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = 3;
        check = new int[N + 1];
        DFS(1);
    }
}
