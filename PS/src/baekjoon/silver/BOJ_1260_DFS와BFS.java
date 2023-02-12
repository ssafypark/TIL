package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260_DFS와BFS {

    private static int N;
    private static int M;
    private static int V;
    private static int s;
    private static int e;
    private static int nowVertex;
    private static ArrayList<Integer>[] arr;
    private static boolean[] visited;
    private static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        for (int i = 1; i <= N; i++) { // 번호가 작은 것을 먼저 방문하기 위해 정렬하기
            Collections.sort(arr[i]);
        }
        visited = new boolean[N + 1]; // 방문배열 초기화
        sb = new StringBuilder();
        DFS(V);
        System.out.println(sb);
        visited = new boolean[N + 1]; // 방문배열 초기화
        sb = new StringBuilder();
        BFS(V);
        System.out.println(sb);
    }

    private static void DFS (int vertex) { // vertex : 정점
        sb.append(vertex).append(" ");
        visited[vertex] = true;
        for (int i : arr[vertex]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS (int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        visited[vertex] = true;
        while (!queue.isEmpty()) {
            nowVertex = queue.poll();
            sb.append(nowVertex).append(" ");
            for (int i : arr[nowVertex]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}

/*
    - 1번 정점부터 시작
    1 -> 2, 3, 4
    2 -> 4
    3 -> 4

    DFS : 1 -> 2 -> 4 -> 3
    BFS : 1 -> 2 -> 3 -> 4

    - 3번 정점부터 시작
    1 -> 2
    3 -> 1, 4
    5 -> 2, 4

    DFS : 3 -> 1 -> 2 -> 5 -> 4 (동작방식?)
    BFS : 3 -> 1 -> 4 -> 2 -> 5

 */