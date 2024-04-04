package Algo_2023.baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920_수찾기_P1 {

    private static int N;
    private static int M;
    private static int start;
    private static int end;
    private static int findNumber;
    private static int midIndex;
    private static int midValue;
    private static boolean find;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            findNumber = Integer.parseInt(st.nextToken());
            start = 0;
            end = arr.length - 1;
            find = false;
            while (start <= end) {
                midIndex = (start + end) / 2;
                midValue = arr[midIndex];
                if (findNumber < midValue) {
                    end = midIndex - 1;
                } else if (findNumber > midValue) {
                    start = midIndex + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
