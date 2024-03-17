package Algo_2023.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157_단어공부_P1 {

    private static int max = Integer.MIN_VALUE;
    private static char alphabet;
    private static String str;
    private static int[] cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().toUpperCase();
        cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                alphabet = (char)(i + 'A');
            } else if (cnt[i] == max) {
                alphabet = '?';
            }
        }
        System.out.println(alphabet);
    }
}
