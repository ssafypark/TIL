package Algo_2024.baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_스택수열 {

    private static int N;
    private static int[] arr;
    private static int[] check;

    public static StringBuilder solution() {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int val = 1;
        for (int i = 0; i < N; i++) {
            while (stack.isEmpty() || stack.peek() < arr[i]) {
                if (check[arr[i]] == 1) {
                    sb.delete(0, sb.length());
                    sb.append("NO");
                    return sb;
                }
                stack.push(val++);
                sb.append('+').append('\n');
            }
            if (stack.peek() >= arr[i]) {
                check[stack.pop()] = 1;
                sb.append('-').append('\n');
            }
        }
        return sb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        check = new int[N + 1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution());
    }
}
