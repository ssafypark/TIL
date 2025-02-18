package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_14_피자배달거리 {

    private static int N;
    private static int M;
    private static int volume;
    private static int sum;
    private static int min = Integer.MAX_VALUE;
    private static int[] combi;
    private static int[][] map;
    private static ArrayList<int[]> house = new ArrayList<>();
    private static ArrayList<int[]> pizza = new ArrayList<>();

    public static void DFS(int L, int start) {
        if (L == M) {
            min = Math.min(min, sum);
        } else {
            for (int i = start; i < volume; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    house.add(new int[]{i, j});
                } else if (map[i][j] == 2) {
                    pizza.add(new int[]{i, j});
                }
            }
        }
        combi = new int[M];
        volume = pizza.size();
        DFS(0, 0);
        System.out.println(min);
    }
}
