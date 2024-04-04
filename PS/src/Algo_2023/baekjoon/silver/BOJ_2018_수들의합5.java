package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2018_수들의합5 {

    private static int N;
    private static int cnt;
    private static int startIndex;
    private static int endIndex;
    private static int sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cnt = 1;
        startIndex = 1;
        endIndex = 1;
        sum = 1;
        while (endIndex != N) {
            if (sum == N) {
                cnt++;
                endIndex++;
                sum += endIndex;
            } else if (sum > N) {
                sum -= startIndex;
                startIndex++;
            } else {
                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(cnt);
    }
}
