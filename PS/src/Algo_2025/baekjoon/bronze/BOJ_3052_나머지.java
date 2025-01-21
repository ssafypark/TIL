package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_3052_나머지 {

    private static int cnt;
    private static boolean[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new boolean[42];
        for (int i = 0; i < 10; i++) {
            int value = Integer.parseInt(br.readLine());
            arr[value % 42] = true;
        }
        for (int i = 0; i < 42; i++) {
            if (arr[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
