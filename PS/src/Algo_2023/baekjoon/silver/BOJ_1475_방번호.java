package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475_방번호 {

    private static int N;
    private static int idx;
    private static int max;
    private static String str;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        str = Integer.toString(N);
        arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            idx = Integer.parseInt(str.substring(i, i + 1));
            if (idx == 6 || idx == 9) {
                arr[6]++;
            } else {
                arr[idx]++;
            }
        }
        if (arr[6] % 2 == 1) {
            arr[6] = arr[6] / 2 + 1;
        } else {
            arr[6] = arr[6] / 2;
        }
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}
