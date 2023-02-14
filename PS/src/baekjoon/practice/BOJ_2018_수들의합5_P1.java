package baekjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2018_수들의합5_P1 {

    private static int N;
    private static int startIndex;
    private static int endIndex;
    private static int cnt;
    private static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        startIndex = 1;
        endIndex = 1;
        sum = 1;
        while (endIndex != N) {
            if (sum == N) {
                sum -= startIndex;
                startIndex++;
                cnt++;
            } else if (sum < N) {
                endIndex++;
                sum += endIndex;
            } else {
                sum -= startIndex;
                startIndex++;
            }
        }
        if (sum > N) {
            sum -= startIndex;
            if (sum == N) {
                cnt++;
            }
        }
        if (N == 1) {
            System.out.println(1);
        } else {
            System.out.println(cnt);
        }
    }
}
