package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1959_두개의숫자열 {

    private static int T;
    private static int N;
    private static int M;
    private static int tc;
    private static int sum;
    private static int max;
    private static int answer;
    private static int[] arr1;
    private static int[] arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        while (++tc <= T) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr1 = new int[N];
            arr2 = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                arr2[i] = Integer.parseInt(st.nextToken());
            }
            answer = (N > M) ? find(N, M, arr1, arr2) : find(M, N, arr2, arr1);
            System.out.printf("#%d %d\n", tc, answer);
        }
    }

    public static int find(int N, int M, int[] arr1, int[] arr2) {
        max = Integer.MIN_VALUE;
        for (int i = 0; i < N - M + 1; i++) {
            sum = 0;
            for (int j = 0; j < M; j++) {
                sum += arr1[i + j] * arr2[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
