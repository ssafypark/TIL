package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10162_전자레인지 {

    private static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            int A = T / 300;
            T = T % 300;
            int B = T / 60;
            T = T % 60;
            int C = T / 10;
            System.out.println(A + " " + B + " " + C);
        }
    }
}
