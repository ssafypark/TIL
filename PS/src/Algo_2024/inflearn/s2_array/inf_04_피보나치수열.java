package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_04_피보나치수열 {

    private static int N;

    public static void solution(int N) {
        int a = 1;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < N; i++) {
            c = a + b;;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        solution(N);
    }
}
