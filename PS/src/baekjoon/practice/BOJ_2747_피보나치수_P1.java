package baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2747_피보나치수_P1 {

    private static int n;
    private static int result;
    private static int[] cache;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cache = new int[50];
        result = fibo(n);
        System.out.println(result);
    }

    private static int fibo(int n) {
        // base case
        if (n == 1 || n == 2) {
            return 1;
        }
        if (cache[n] != 0) {
            return cache[n];
        }
        cache[n] = fibo(n - 1) + fibo(n - 2);
        //recursive case
        return cache[n];
    }
}
