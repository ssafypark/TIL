package Algo_2024.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_01_합이같은부분집합 {

    private static String answer = "NO";
    private static int N;
    private static int total;
    private static boolean flag;
    private static int[] arr;

    public static void DFS(int depth, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (sum > total/ 2) {
            return;
        }
        if (depth == N) {
            if (total-sum == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            DFS(depth + 1, sum + arr[depth], arr);
            DFS(depth + 1, sum, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(st.nextToken());
            arr[i] = val;
            total += val;
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
