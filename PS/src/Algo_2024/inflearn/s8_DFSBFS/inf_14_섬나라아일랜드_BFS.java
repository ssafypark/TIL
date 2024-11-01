package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_14_섬나라아일랜드_BFS {

    private static int N;
    private static int answer;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int[][] board;
    private static Queue<Point14> queue = new LinkedList<>();

    public static void BFS(int x, int y) {
        queue.add(new Point14(x, y));
        while (!queue.isEmpty()) {
            Point14 pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point14(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    answer++;
                    BFS(i, j);
                }
            }
        }
        System.out.println(answer);
    }
}

class Point14 {
    int x;
    int y;
    Point14 (int x, int y) {
        this.x = x;
        this.y = y;
    }
}