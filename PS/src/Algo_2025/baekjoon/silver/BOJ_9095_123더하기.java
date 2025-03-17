package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9095_123더하기 {

    private static int T;
    private static int num;
    private static int[] dy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        dy = new int[11];
        dy[1] = 1;
        dy[2] = 2;
        dy[3] = 4;
        for (int i = 4; i < 11; i++) {
            dy[i] = dy[i - 3] + dy[i - 2] + dy[i - 1];
        }
        for (int tc = 0; tc < T; tc++) {
            num  = Integer.parseInt(br.readLine());
            System.out.println(dy[num]);
        }
    }
}
