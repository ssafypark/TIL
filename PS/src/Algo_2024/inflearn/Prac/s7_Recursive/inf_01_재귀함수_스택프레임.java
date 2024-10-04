package Algo_2024.inflearn.Prac.s7_Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_재귀함수_스택프레임 {

    private static int N;

    public static void DFS(int N) {
        if (N == 0) {
            return;
        } else {
            System.out.print(N + " ");
            DFS(N - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS(N);
    }
}
