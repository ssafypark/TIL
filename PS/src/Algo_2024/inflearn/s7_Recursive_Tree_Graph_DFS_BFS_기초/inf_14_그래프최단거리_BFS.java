package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
정점의 수 N과 간선의 수 M이 주어진다.
입력예제
6 9
1 3
1 4
2 1
2 5
3 4
4 5
4 6
6 2
6 5

출력
2 : 3
3 : 1
4 : 1
5 : 2
6 : 2

* */
public class inf_14_그래프최단거리_BFS {

    private static int N;
    private static int M;
    private static int[] check;
    private static int[] distance;
    private static ArrayList<ArrayList<Integer>> graph;

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v] = 1;
        distance[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    queue.offer(nv);
                    distance[nv] = distance[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        // 1번부터 N번까지
        check = new int[N + 1];
        distance = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        BFS(1);
        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + distance[i]);
        }
    }
}
