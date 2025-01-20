package Algo_2024.inflearn.Prac.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_11_미로최단거리 {

    private static int[][] map;
    private static int[][] dis;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void BFS(int x, int y) {
        Queue<Point11> queue = new LinkedList<>();
        queue.offer(new Point11(x, y));
        map[1][1] = 1;
        while (!queue.isEmpty()) {
            Point11 point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = point.x + dx[i];
                int ny = point.y + dy[i];
                if (nx > 0 && nx <= 7 && ny > 0 && ny <= 7 && map[nx][ny] == 0) {
                    map[nx][ny] = 1;
                    queue.offer(new Point11(nx, ny));
                    dis[nx][ny] = dis[point.x][point.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 7; j++) {
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

class Point11 {
    int x;
    int y;
    Point11(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
