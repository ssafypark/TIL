package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2839_설탕배달 {

    private static int N;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        while (true) {
            if (N % 5 == 0) {
                cnt += N / 5;
                System.out.println(cnt);
                break;
            } else {
                N -= 3;
                cnt++;
            }
            if (N < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
