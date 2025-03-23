package Algo_2025.inflearn.s8_DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_07_조합수_메모제이션 {

    private static int N;
    private static int R;
    private static int[][] arr;

    public static int solution(int N, int R) {
        if (arr[N][R] > 0) {
            return arr[N][R];
        }
        if (N == R || R == 0) {
            return 1;
        } else {
            return arr[N][R] = solution(N - 1, R - 1) + solution(N - 1, R);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        arr = new int[35][35];
        System.out.println(solution(N, R));
    }
}
