package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10810_공넣기 {

    private static int i;
    private static int j;
    private static int k;
    private static int N;
    private static int M;
    private static int num;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        for (int a = 0; a < M; a++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            num = j - i + 1;
            for (int b = 0; b < num; b++) {
                arr[i++] = k;
            }
        }
        for (int i = 1 ; i <= N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
