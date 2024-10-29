package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_11_미로탐색_최단거리통로_BFS {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] board;
    private static int[][] distance;

    public static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x, y));
        board[x][y] = 1;
        while (!queue.isEmpty()) {
            Point temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new Point(nx, ny));
                    distance[nx][ny] = distance[temp.x][temp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int[8][8];
        distance = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 7; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        BFS(1, 1);
        if (distance[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(distance[7][7]);
        }
    }
}

class Point{
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}