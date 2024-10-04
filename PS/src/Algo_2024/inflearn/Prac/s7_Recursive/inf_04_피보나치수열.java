package Algo_2024.inflearn.Prac.s7_Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 입력예제
* 10
*
* 출력예제
* 1 1 2 3 5 8 13 21 34 55
*
* */
public class inf_04_피보나치수열 {

    private static int N;

    // 속도 최적화하기 위해 fibo 배열 생성
    private static int[] fibo;

    public static int DFS(int N) {
        if (N == 1) {
            return fibo[N] = 1;
        } else if (N == 2){
            return fibo[N] = 1;
        } else {
            return fibo[N] = DFS(N - 1) + DFS(N - 2);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        fibo = new int[N + 1];
        DFS(N);
        for (int i = 1; i <= N; i++) {
//            System.out.print(DFS(i) + " ");
            System.out.print(fibo[i] + " ");
        }
    }
}
