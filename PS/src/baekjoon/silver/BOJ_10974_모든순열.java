package baekjoon.silver;

import java.util.Scanner;

public class BOJ_10974_모든순열 {

    private static int N;
    private static int[] arr;
    private static int[] output;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        output = new int[N];
        visited = new boolean[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i + 1;
        }
        permutation(0);
    }

    private static void permutation(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                System.out.print(output[i] + " ");
            }
            System.out.println();
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
