package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_13023_ABCDE {

    private static int N;
    private static int M;
    private static int a;
    private static int b;
    private static boolean arrive;
    private static ArrayList<Integer>[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0 ; i < arr.length; i++) {
            arr[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i = 0; i < N; i++) {
            DFS(i , 1); // depth 1부터 시작
            if (arrive) {
                break;
            }
        }
        if (arrive) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }
        visited[now] = true;
        for (int i : arr[now]) {
            if (!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
