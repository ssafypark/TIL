package Algo_2023.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1940_주몽_P1 {

    private static int N;
    private static int M;
    private static int startIndex;
    private static int endIndex;
    private static int cnt;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        endIndex = N - 1;
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] < M) {
                startIndex++;
            } else if (arr[startIndex] + arr[endIndex] == M) {
                cnt++;
                startIndex++;
                endIndex--;
            } else {
                endIndex--;
            }
        }
        System.out.println(cnt);
    }
}
