package Algo_2025.inflearn.s10_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_02_돌다리건너기 {

    private static int N;
    private static int[] dp;

    public static int solution() {
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= N + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N + 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new int[N + 2];
        System.out.println(solution());
    }
}
