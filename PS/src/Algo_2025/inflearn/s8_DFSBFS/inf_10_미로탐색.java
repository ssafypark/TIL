package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_10_미로탐색 {

    private static int cnt;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {-1, 0, 1, 0};
    private static int[][] map;

    public static void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            cnt++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx > 0 && nx < 8 && ny > 0 && ny < 8 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    DFS(nx, ny);
                    map[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[8][8];
        for (int i = 1; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 8; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        map[1][1] = 1;
        DFS(1, 1);
        System.out.println(cnt);
    }
}
