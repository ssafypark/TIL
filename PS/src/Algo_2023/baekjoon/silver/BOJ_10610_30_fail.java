package Algo_2023.baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10610_30_fail {

    private static String N;
    private static String str;
    private static int max;
    private static char[] arr;
    private static char[] output;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = br.readLine();
        arr = new char[N.length()];
        output = new char[N.length()];
        visited = new boolean[N.length()];
        for (int i = 0; i < N.length(); i++) {
            arr[i] = N.charAt(i);
        }
        max = -1;
        permutation(0);
        System.out.println(max);
    }

    private static void permutation(int depth) {
        if (depth == N.length()) {
            getMax();
            return;
        }
        for (int i = 0; i < N.length(); i++) {
            if (!visited[i]) {
                output[depth] = arr[i];
                visited[i] = true;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }

    private static int getMax() {
        str = "";
        for (int i = 0; i < N.length(); i++) {
            str += output[i];
        }
        if (Integer.parseInt(str) % 30 == 0) {
            max = Math.max(Integer.parseInt(str), max);
            return max;
        } else {
            return -1;
        }
    }
}
