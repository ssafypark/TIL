package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11053_가장긴증가하는부분수열 {

    private static int A;
    private static int[] arr;
    private static int[] dp;

    public static int solution() {
        int answer = 0;
        dp[0] = 1;
        answer = dp[0];
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dp[j] > max) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        arr = new int[A];
        dp = new int[A];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(solution());
    }
}
