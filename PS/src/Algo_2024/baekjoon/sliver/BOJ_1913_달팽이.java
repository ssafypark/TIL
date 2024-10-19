package Algo_2024.baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1913_달팽이 {

    private static int N;
    private static int M;
    private static int[][] arr;

    public static void solution() {
        int x = N / 2;
        int y = N / 2;
        int cnt = 1;
        int val = 1;
        int answerX = 0;
        int answerY = 0;
        while (true) {
            for (int i = 0; i < cnt; i++) {
                arr[x--][y] = val++;
            }
            if (val - 1 == N * N) {
                break;
            }
            for (int i = 0; i < cnt; i++) {
                arr[x][y++] = val++;
            }
            cnt++;
            for (int i = 0; i < cnt; i++) {
                arr[x++][y] = val++;
            }
            for (int i = 0; i < cnt; i++) {
                arr[x][y--] = val++;
            }
            cnt++;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] == M) {
                    answerX = i + 1;
                    answerY = j + 1;
                }
            }
            System.out.println();
        }
        System.out.println(answerX + " " + answerY);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        solution();
    }
}
