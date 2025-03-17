package Algo_2025.inflearn.s10_dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_01_계단오르기 {

    private static int N;
    private static int[] dy;

    public static int solution() {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= N; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dy = new int[N + 1];
        System.out.println(solution());
    }
}
