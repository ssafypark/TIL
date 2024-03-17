package Algo_2023.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1236_성지키기 {

    private static int N;
    private static int M;
    private static int existRowCnt;
    private static int existColCnt;
    private static int rowCnt;
    private static int colCnt;
    private static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            boolean exist = false;
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist == true) {
                existRowCnt++;
            }
        }

        for (int i = 0; i < M; i++) {
            boolean exist = false;
            for (int j = 0; j < N; j++) {
                if (arr[j][i] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist == true) {
                existColCnt++;
            }
        }

        rowCnt = N - existRowCnt;
        colCnt = M - existColCnt;

        System.out.println(Math.max(rowCnt, colCnt));
    }
}
