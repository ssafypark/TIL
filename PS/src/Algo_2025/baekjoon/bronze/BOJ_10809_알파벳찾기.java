package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809_알파벳찾기 {

    private static String S;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
        arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i) - 97] == -1) {
                arr[S.charAt(i) - 97] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
