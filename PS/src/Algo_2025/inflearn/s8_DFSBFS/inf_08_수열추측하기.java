package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_08_수열추측하기 {

    private static int N;
    private static int F;
    private static boolean flag;
    private static int[] arr; // 조합 넣어두는 배열
    private static int[] check; // 체크 배열
    private static int[] combiVal; // 조합 * 규칙 배열
    private static int[][] memorization; // 메모리제이션 배열

    public static int combi(int n, int r) {
        if (memorization[n][r] > 0) {
            return memorization[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return memorization[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public static void DFS(int L, int sum) {
        if (flag) {
            return;
        }
        if (L == N) {
            if (sum == F) {
                for (int x : arr) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    arr[L] = i;
                    DFS(L + 1, sum + (combiVal[L] * arr[L]));
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());
        arr = new int[N];
        check = new int[N + 1];
        combiVal = new int[N];
        memorization = new int[15][15];
        for (int i = 0; i < N; i++) {
            combiVal[i] = combi(N - 1, i);
        }
        DFS(0, 0);
    }
}
