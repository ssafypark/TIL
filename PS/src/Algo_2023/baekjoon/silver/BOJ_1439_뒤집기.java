package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1439_뒤집기 {

    private static String S;
    private static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                cnt++;
            }
        }
        if (cnt == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(cnt / 2 + cnt % 2);
    }
}
