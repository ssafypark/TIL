package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2003_수들의합2 {

    private static int N;
    private static int M;
    private static int startIndex;
    private static int endIndex;
    private static int sum;
    private static int cnt;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sum = arr[0];
        while (endIndex < N) {
            if (sum == M) {
                cnt++;
                endIndex++;
                sum += arr[endIndex];
            } else if (sum > M) {
                sum -= arr[startIndex];
                startIndex++;
            } else {
                endIndex++;
                sum += arr[endIndex];
            }
        }
        System.out.println(cnt);
    }
}
