package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ_2606_바이러스 {

    private static int N;
    private static int tc;
    private static int answer;
    private static int[] check;
    private static ArrayList<ArrayList<Integer>> graph;

    public static int DFS(int L) {
        for (int nv : graph.get(L)) {
            if (check[nv] == 0) {
                check[nv] = 1;
                DFS(nv);
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        tc = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        check = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        check[1] = 1;
        System.out.println(DFS(1));
    }
}
