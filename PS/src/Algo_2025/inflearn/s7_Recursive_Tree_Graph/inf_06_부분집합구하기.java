package Algo_2025.inflearn.s7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_06_부분집합구하기 {

    private static int N;
    private static int[] check;

    public static void DFS(int L) {
        if (L == N + 1) {
            for (int i = 1; i <= N; i++) {
                if (check[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            check[L] = 1;
            DFS(L + 1);
            check[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        check = new int[N + 1];
        DFS(1);
    }
}
