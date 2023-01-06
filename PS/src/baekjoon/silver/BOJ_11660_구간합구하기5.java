package baekjoon.silver;

import java.util.*;
import java.io.*;

public class BOJ_11660_구간합구하기5 {

    private static int N;
    private static int M;
    private static int x1;
    private static int y1;
    private static int x2;
    private static int y2;
    private static int sum;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(bf.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = arr[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            sum = 0;
            for (int j = x1; j <= x2; j++) {
                sum += arr[j][y2] - arr[j][y1 - 1];
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
