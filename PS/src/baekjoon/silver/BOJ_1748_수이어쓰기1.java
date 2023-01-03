package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748_수이어쓰기1 {

    private static int N;
    private static int answer = 0;
    private static int length = 10;
    private static int cnt = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i == length) {
                length *= 10;
                cnt++;
            }
            answer += cnt;
        }
        System.out.println(answer);
    }
}
