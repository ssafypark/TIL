package Algo_2024.inflearn.Prac.s7_Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_08_송아지찾기 {

    private static int s;
    private static int e;
    private static int[] check;
    private static int[] dis = {1, -1, 5};

    public static int BFS() {
        int L = 0;
        Queue<Integer> queue = new LinkedList<>();
        check = new int[10001];
        queue.add(s);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();
                if (e == x) {
                    return L;
                }
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx > 0 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        queue.add(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        System.out.println(BFS());
    }
}
