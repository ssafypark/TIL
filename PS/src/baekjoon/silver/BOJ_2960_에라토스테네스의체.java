package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2960_에라토스테네스의체 {

    private static int N;
    private static int K;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        isPrime(N);
    }

    private static void isPrime(int n) {
        boolean[] check = new boolean[n + 1];
        for (int i = 2; i < n + 1; i++) {
            for (int j = i; j < n + 1; j += i) {
                if (!check[j]) {
                    check[j] = true;
                    cnt++;
                }
                if (cnt == K) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
