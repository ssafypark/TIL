package Algo_2024.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1236_성지키기 {

    private static int N;
    private static int M;
    private static int existRowCnt;
    private static int existColCnt;
    private static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }
        // 행에서 경비원 찾기
        for (int i = 0; i < N; i++) {
            boolean exist = false;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) {
                existRowCnt++;
            }
        }
        // 열에서 경비원 찾기
        for (int i = 0; i < M; i++) {
            boolean exist = false;
            for (int j = 0; j < N; j++) {
                if (map[j][i] == 'X') {
                    exist = true;
                    break;
                }
            }
            if (exist) {
                existColCnt++;
            }
        }
        // 보호받지 못하는 행열
        int rowCnt = N - existRowCnt;
        int colCnt = M - existColCnt;

        System.out.println(Math.max(rowCnt, colCnt));
    }
}
