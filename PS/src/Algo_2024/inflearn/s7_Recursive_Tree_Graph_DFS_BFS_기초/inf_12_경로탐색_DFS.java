package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
입력
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

출력
6
* */
public class inf_12_경로탐색_DFS {

    private static int N;
    private static int M;
    private static int answer;
    private static int[][] graph;
    private static int[] check;

    public static void DFS(int vertex) {
        if (vertex == N) {
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[vertex][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new int[N + 1][N + 1];
        check = new int[N + 1];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
        }
        check[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
