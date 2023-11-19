package baekjoon.practice;

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
        str = br.readLine();
        cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                cnt[ch - 'A']++;
            } else {
                cnt[ch - 'a']++;
            }
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
