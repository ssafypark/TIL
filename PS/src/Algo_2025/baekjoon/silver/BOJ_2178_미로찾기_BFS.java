package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178_미로찾기_BFS {

    private static int N;
    private static int M;
    private static int[][] map;
    private static int[][] dis;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {-1, 0, 1, 0};

    public static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        map[x][y] = 0;
        dis[x][y] = 1;
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                if (nx > 0 && nx < N + 1 && ny > 0 && ny < M + 1 && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    queue.offer(new int[] {nx, ny});
                    dis[nx][ny] = dis[now[0]][now[1]] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N + 1][M + 1];
        dis = new int[N + 1][M + 1];
        for (int i = 1; i < N + 1; i++) {
            String str = br.readLine();
            for (int j = 1; j < M + 1; j++) {
                map[i][j] = str.charAt(j - 1) - '0';
            }
        }
        BFS(1, 1);
        System.out.println(dis[N][M]);
    }
}
