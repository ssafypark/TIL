package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1205_등수구하기 {

    private static int N;
    private static int score;
    private static int size;
    private static int rank;
    private static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        score = Integer.parseInt(st.nextToken());
        size = Integer.parseInt(st.nextToken());
        if (N == 0) {
            System.out.println(1);
            return;
        }
        arr = new Integer[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (N == size && score <= arr[N - 1]) {
            System.out.println(-1);
            return;
        } else {
            rank = 1;
            for (int i = 0; i < N; i++) {
                if (score >= arr[i]) {
                    rank = i + 1;
                    break;
                } else {
                    rank++;
                }
            }
            if (rank <= size) {
                System.out.println(rank);
            } else {
                System.out.println(-1);
            }
        }
    }
}
