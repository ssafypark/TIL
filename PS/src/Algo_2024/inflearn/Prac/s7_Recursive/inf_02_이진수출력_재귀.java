package Algo_2024.inflearn.Prac.s7_Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_02_이진수출력_재귀 {

    private static int N;

    public static void DFS(int N) {
        if (N == 0) {
            return;
        } else {
            DFS(N / 2);
            System.out.print(N % 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS(N);
    }
}
