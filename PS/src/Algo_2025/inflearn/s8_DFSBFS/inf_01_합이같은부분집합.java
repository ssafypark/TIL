package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_01_합이같은부분집합 {

    private static int N;
    private static int total;
    private static String answer;
    private static boolean flag;
    private static int[] arr;

    public static void DFS(int L, int sum) {
        if (sum > total || flag == true) {
            return;
        }
        if (L == N) {
            if (sum == total) {
                flag = true;
                answer = "YES";
            }
        } else {
            DFS(L + 1, sum + arr[L]);
            DFS(L + 1, sum);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        answer = "NO";
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        total = total / 2;
        DFS(0, 0);
        System.out.println(answer);
    }
}
