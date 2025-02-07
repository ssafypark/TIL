package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_11_미로탐색_BFS {


    private static int[][] map;
    private static int[][] dis;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {-1, 0, 1, 0};

    public static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        map[x][y] = 1;
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx > 0 && nx < 8 && ny > 0 && ny < 8 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    queue.offer(new int[] {nx, ny});
                    dis[nx][ny] = dis[now[0]][now[1]] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j < 8; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS(1, 1);
        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }
}
