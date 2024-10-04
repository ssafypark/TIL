package Algo_2024.inflearn.Prac.s7_Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_03_팩토리얼 {

    private static int N;

    public static int DFS(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N * DFS(N - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        System.out.println(DFS(N));
    }
}
