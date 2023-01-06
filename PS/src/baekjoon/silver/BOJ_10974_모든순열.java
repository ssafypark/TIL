package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_10974_모든순열 {

    private static int N;
    private static int[] arr;
    private static int[] output;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        output = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i + 1;
        }
        permutation(0);
    }

    private static void permutation(int depth) {
        StringBuilder sb = new StringBuilder();
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(output[i]).append(" ");
            }
            System.out.println(sb);
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                output[depth] = arr[i];
                visited[i] = true;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
}
