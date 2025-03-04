package Algo_2025.inflearn.s7_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_13_경로탐색_인접리스트_ArrayList {

    private static int n;
    private static int m;
    private static int cnt;
    private static int[] check;
    private static ArrayList<ArrayList<Integer>> graph;

    public static void DFS(int v) {
        if (v == n) {
            cnt++;
        } else {
            for (int nv : graph.get(v)) {
                if (check[nv] == 0) {
                    check[nv] = 1;
                    DFS(nv);
                    check[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        check = new int[n + 1];
        // 객체 생성
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        // 그래프 저장
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }
        check[1] = 1;
        DFS(1);
        System.out.println(cnt);
    }
}
