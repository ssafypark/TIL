package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/*
입력예제
5 9
1 2
1 3
1 4
2 1
2 3
2 5
3 4
4 2
4 5

출력예제
6
* */
public class inf_13_경로탐색_인접리스트_ArrayList_DFS {

    private static int N;
    private static int M;
    private static int answer;
    private static int[] check;
    private static ArrayList<ArrayList<Integer>> graph;

    public static void DFS(int v) {
        if (v == N) {
            answer++;
        } else {
            for (int nx : graph.get(v)) {
                if (check[nx] == 0) {
                    check[nx] = 1;
                    DFS(nx);
                    check[nx] = 0;
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
        check = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        check[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
