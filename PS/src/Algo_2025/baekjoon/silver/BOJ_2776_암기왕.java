package Algo_2025.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2776_암기왕 {

    private static int T;
    private static int N;
    private static int M;
    private static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int TC = 0; TC < T; TC++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int find = Integer.parseInt(st.nextToken());
                int lt = 0;
                int rt = N - 1;
                boolean flag = false;
                while (lt <= rt) {
                    int mid = (lt + rt) / 2;
                    if (arr[mid] < find) {
                        lt = mid + 1;
                    } else if (arr[mid] > find) {
                        rt = mid - 1;
                    } else if (arr[mid] == find) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
