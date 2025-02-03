package Algo_2025.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1292_쉽게푸는문제 {

    private static int A;
    private static int B;
    private static int val;
    private static int cnt;
    private static int answer;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        arr = new int[1001];
        val = 1;
        for (int i = 1; i < 1001; i++) {
            for (int j = 0; j < i && val < 1001; j++) {
                arr[val++] = i;
            }
        }
        cnt = B - A + 1;
        for (int i = 0; i < cnt; i++) {
            answer += arr[A++];
        }
        System.out.println(answer);
    }
}
