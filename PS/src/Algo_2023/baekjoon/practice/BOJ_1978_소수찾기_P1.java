package Algo_2023.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978_소수찾기_P1 {

    private static int N;
    private static int cnt;
    private static boolean prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            isPrime(Integer.parseInt(st.nextToken()));
        }
        System.out.println(cnt);
    }

    private static void isPrime(int num) {
        prime = true;
        if (num == 0 || num == 1) {
            prime = false;
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                return;
            }
        }
        if (prime) {
            cnt++;
        }
    }
}
