package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10819_차이를최대로 {

    private static int N;
    private static int sum;
    private static int max;
    private static int[] arr;
    private static int[] output;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        output = new int[N];
        visited = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        permutation(0);
        System.out.println(max);
    }

    private static void permutation(int depth) {
        if (depth == N) {
            max = Math.max(getMax(), max);
            return;
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

    private static int getMax() {
        sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += Math.abs(output[i] - output[i + 1]);
        }
        return sum;
    }
}
