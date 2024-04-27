package Algo_2024.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1371_가장많은글자 {

    private static String str = "";
    private static String temp;
    private static int max;

    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[26];
        while ((temp = br.readLine()) != null && !temp.isEmpty()) {
            str += temp;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                arr[str.charAt(i) - 'a']++;
                if (arr[str.charAt(i) - 'a'] > max) {
                    max = arr[str.charAt(i) - 'a'];
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == max) {
                System.out.print((char) (i + 'a'));
            }
        }
    }
}
