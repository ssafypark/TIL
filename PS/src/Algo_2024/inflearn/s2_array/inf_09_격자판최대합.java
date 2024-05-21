package Algo_2024.inflearn.s2_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_09_격자판최대합 {

    private static int N;
    private static int row;
    private static int col;
    private static int cross;
    private static int reverse_cross;
    private static int rowMax;
    private static int colMax;
    private static int[][] arr;

    public static int solution(int[][] arr) {
        int answer = 0;
        // 가로
        for (int i = 0; i < N; i++) {
            row = 0;
            for (int j = 0; j < N; j++) {
                row += arr[i][j];
            }
            rowMax = Math.max(rowMax, row);
        }
        // 세로
        for (int i = 0; i < N; i++) {
            col = 0;
            for (int j = 0; j < N; j++) {
                col += arr[j][i];
            }
            colMax = Math.max(colMax, col);
        }
        // 왼오 대각
        for (int i = 0; i < N; i++) {
            cross += arr[i][i];
        }
        // 오왼 대각
        for (int i = N - 1; i >= 0; i--) {
            reverse_cross += arr[i][i];
        }
        answer = Math.max(Math.max(rowMax, colMax), Math.max(cross, reverse_cross));
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solution(arr));
    }
}
