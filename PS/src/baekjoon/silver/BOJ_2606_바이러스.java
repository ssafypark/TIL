package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2606_바이러스 {

    private static int N;
    private static int M;
    private static int s;
    private static int e;
    private static int cnt;
    private static ArrayList<Integer>[] arr;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        DFS(1);
        System.out.println(cnt);
    }

    private static void DFS(int vertex) {
        visited[vertex] = true;
        for (int i : arr[vertex]) {
            if (!visited[i]) {
                DFS(i);
                cnt++;
            }
        }
    }
}
