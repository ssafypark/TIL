package Algo_2024.inflearn.s7_Recursive_Tree_Graph_DFS_BFS_기초;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_08_송아지찾기1_BFS {

    private static int S;
    private static int E;
    private static int[] dis = {1, -1, 5};
    private static int[] check;

    public static int BFS(int S, int E) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        check = new int[10001];
        check[S] = 1;
        queue.offer(S);
        int L = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int temp = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = temp + dis[j];
                    if (nx == E) {
                        return ++L;
                    }
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        System.out.println(BFS(S, E));
    }
}
