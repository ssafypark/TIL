package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659_구간합구하기4 {

    private static int N;
    private static int M;
    private static int start;
    private static int end;
    private static int total;
    private static int TC;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        st = new StringTokenizer(bf.readLine());
        for (int i = 1; i < N + 1; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }
        while (TC++ < M) {
            total = 0;
            st = new StringTokenizer(bf.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            System.out.println(arr[end] - arr[start - 1]);
        }
    }
}
