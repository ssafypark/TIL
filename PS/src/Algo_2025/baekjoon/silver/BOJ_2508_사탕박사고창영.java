package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2508_사탕박사고창영 {

    private static int T;
    private static int x;
    private static int y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            char[][] map = new char[x][y];
            for (int i = 0; i < x; i++) {
                map[i] = br.readLine().toCharArray();
            }
            int cnt = 0;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if (map[i][j] == '>') {
                        if (j + 1 < y && map[i][j + 1] == 'o') {
                            if (j + 2 < y && map[i][j + 2] == '<') {
                                cnt++;
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    if (map[j][i] == 'v') {
                        if (j + 1 < x && map[j + 1][i] == 'o') {
                            if (j + 2 < x && map[j + 2][i] == '^') {
                                cnt++;
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
